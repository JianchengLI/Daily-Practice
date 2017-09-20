/**
 * 一个数据结构只要部署了Symbol.iterator属性，
 * 就被视为具有iterator接口，就可以用for...of循环遍历它的成员。
 * 也就是说，for...of循环内部调用的是数据结构的Symbol.iterator方法
 */

/**
 * 1. 数组原生具备iterator接口（即默认部署了Symbol.iterator属性）
 */
const arr = ['red', 'green', 'blue'];

for(let v of arr) {
    console.log(v); // red green blue
}

const obj = {};
obj[Symbol.iterator] = arr[Symbol.iterator].bind(arr);

for(let v of obj) {
    console.log(v); // red green blue
}
/*
 *JavaScript 原有的for...in循环，只能获得对象的键名，不能直接获取键值。ES6 提供for...of循环，允许遍历获得键值。
 */
var array = ['a', 'b', 'c', 'd'];

for (let a in array) {
    console.log(a); // 0 1 2 3
}

for (let a of array) {
    console.log(a); // a b c d
}

/**
 * 2. Set 和 Map 结构也原生具有 Iterator 接口，可以直接使用for...of循环
 */
var engines = new Set(["Gecko", "Trident", "Webkit", "Webkit"]);
for (var e of engines) {
    console.log(e);
}
// Gecko
// Trident
// Webkit

var es6 = new Map();
es6.set("edition", 6);
es6.set("committee", "TC39");
es6.set("standard", "ECMA-262");
for (var [name, value] of es6) {
    console.log(name + ": " + value);
}
// edition: 6
// committee: TC39
// standard: ECMA-262

/**
 * 3. 并不是所有类似数组的对象都具有 Iterator 接口，一个简便的解决方法，
 * 就是使用Array.from方法将其转为数组
 */
let arrayLike = { length: 2, 0: 'a', 1: 'b' };

// 报错
for (let x of arrayLike) {
    console.log(x);
}

// 正确
for (let x of Array.from(arrayLike)) {
    console.log(x);
}
