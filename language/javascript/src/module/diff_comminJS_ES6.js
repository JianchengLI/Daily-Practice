/**
 * CommonJS 模块输出的是值的拷贝，
 * 也就是说，一旦输出一个值，模块内部的变化就影响不到这个值。请看下面这个模块文件lib.js的例子。
 */
//
// var counter = 3;
// function incCounter() {
//     counter++;
// }
// module.exports = {
//     counter: counter,
//     incCounter: incCounter,
// };

/**
 * 上面代码输出内部变量counter和改写这个变量的内部方法incCounter。
 * 然后，在main.js里面加载这个模块
 */
// var mod = require('./lib');
//
// console.log(mod.counter);  // 3
// mod.incCounter();
// console.log(mod.counter); // 3

/**
 * 上面代码说明，lib.js模块加载以后，它的内部变化就影响不到输出的mod.counter了。
 * 这是因为mod.counter是一个原始类型的值，会被缓存。除非写成一个函数，才能得到内部变动后的值
 */
// var counter = 3;
// function incCounter() {
//     counter++;
// }
// module.exports = {
//     get counter() { // TODO: Important !!!
//         return counter
//     },
//     incCounter: incCounter,
// };

// 3
// 4

// run babel-node diff_comminJS_ES6.js
import { counter, incCounter } from './lib_es6';
console.log(counter); // 3
incCounter();
console.log(counter); // 4
// 上面代码说明，ES6 模块输入的变量counter是活的，完全反应其所在模块lib.js内部的变化

/**
 * 由于 ES6 输入的模块变量，只是一个“符号连接”，所以这个变量是只读的，对它进行重新赋值会报错
 */
// counter = {} // ERROR

/**

  Node 对 ES6 模块的处理比较麻烦，因为它有自己的 CommonJS 模块格式，
  与 ES6 模块格式是不兼容的。目前的解决方案是，将两者分开，ES6 模块和 CommonJS 采用各自的加载方案。

  Node 要求 ES6 模块采用.mjs后缀文件名。也就是说，只要脚本文件里面使用import或者export命令，
  那么就必须采用.mjs后缀名。require命令不能加载.mjs文件，会报错，只有import命令才可以加载.mjs文件。反过来，.mjs文件里面也不能使用require命令，必须使用import
 */