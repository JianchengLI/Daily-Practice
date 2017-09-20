function timeout(ms) {
    return new Promise((resolve, reject) => {
        setTimeout(resolve, ms, 'done');
    });
}

timeout(10000).then((value) => {
    console.log(value);
});


//Promise 新建后就会立即执行。
let promise = new Promise(function(resolve, reject) {
    console.log('Promise');
    resolve();
});

promise.then(function() {
    console.log('resolved.');
}).then(()=>{console.log('resolved x2.')});

console.log('Hi!');