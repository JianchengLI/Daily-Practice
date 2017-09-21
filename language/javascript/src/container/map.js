/**
 * JavaScript 的对象（Object），本质上是键值对的集合（Hash 结构），
 * 但是传统上只能用字符串当作键。这给它的使用带来了很大的限制
 */

//为了解决这个问题，ES6 提供了 Map 数据结构。它类似于对象，也是键值对的集合，但是“键”的范围不限于字符串，各种类型的值（包括对象）都可以当作键。
const m = new Map();
const o = {p: 'Hello World'};

m.set(o, 'content')
m.get(o) // "content"

m.has(o) // true
m.delete(o) // true
m.has(o) // false

/*keys()：返回键名的遍历器
values()：返回键值的遍历器
entries()：返回键值对的遍历器
forEach()：使用回调函数遍历每个成员
结合数组的map方法、filter方法以用于 Map*/
const map0 = new Map()
    .set(1, 'a')
    .set(2, 'b')
    .set(3, 'c');

const map1 = new Map(
    [...map0].filter(([k, v]) => k < 3)
);