/**
 * 跟传统的try/catch代码块不同的是，如果没有使用catch方法指定错误处理的回调函数，
 * Promise 对象抛出的错误不会传递到外层代码，即不会有任何反应。
 */

const someAsyncThing = function() {
    return new Promise(function(resolve, reject) {
        // 下面一行会报错，因为x没有声明
        resolve(x + 2);
    });
};

someAsyncThing().then(function() {
    console.log('everything is great');
});

setTimeout(() => { console.log(123) }, 2000);
// Uncaught (in promise) ReferenceError: x is not defined
// 123

/**
 * So 总是使用catch方法
 */

someAsyncThing().then(function() {
    console.log('everything is great');
}).catch((e)=>{
    console.log(e);
    console.log("fin");
});



Promise.resolve()
    .catch(function(error) {
        console.log('oh no', error);
    })
    .then(function() {
        console.log('carry on');
    });
//上面代码运行完catch方法指定的回调函数，会接着运行后面那个then方法指定的回调函数。如果没有报错，则会跳过catch方法。