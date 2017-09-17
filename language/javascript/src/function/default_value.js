/**
 * ES6 允许为函数的参数设置默认值，即直接写在参数定义的后面
 */
function log(x, y = 'World') {
    // let x = 'hello'; 参数变量是默认声明的，所以不能用let或const再次声明。
    console.log(x, y);
}

log('Hello') // Hello World
log('Hello', 'China') // Hello China
log('Hello', '') // Hello

function log2(options = {}) {
    console.log(options);
    console.log(options.a);
    console.log(options.b);
}

log2();
log2({a:1});
log2({a:1,b:2});