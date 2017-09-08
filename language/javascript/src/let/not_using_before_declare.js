/**
 * var 命令会发生”变量提升“现象，即变量可以在声明之前使用，值为undefined.
 * 为了纠正这种现象，let命令改变了语法行为，它所声明的变量一定要在声明后使用，否则报错
 */
console.log(foo); // 输出undefined
var foo = 2;

//let 的情况
console.log(bar); // 报错ReferenceError
let bar = 2;