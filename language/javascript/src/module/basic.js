/**
 * ES6 的模块自动采用严格模式，不管你有没有在模块头部加上"use strict"
 * 严格模式主要有以下限制。:
       变量必须声明后再使用
       函数的参数不能有同名属性，否则报错
       不能使用with语句
       不能对只读属性赋值，否则报错
       不能使用前缀0表示八进制数，否则报错
       不能删除不可删除的属性，否则报错
       不能删除变量delete prop，会报错，只能删除属性delete global[prop]
       eval不会在它的外层作用域引入变量
       eval和arguments不能被重新赋值
       arguments不会自动反映函数参数的变化
       不能使用arguments.callee
       不能使用arguments.caller
       禁止this指向全局对象
       不能使用fn.caller和fn.arguments获取函数调用的堆栈
       增加了保留字（比如protected、static和interface）
 */

let firstName = 'Michael';
let lastName = 'Jackson';
let year = 1958;

export {firstName, lastName, year}; // ES6
// exports.firstName = firstName;
// exports.lastName = lastName;
// exports.year = year;

