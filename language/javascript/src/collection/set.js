/**
 * 1. ES6 提供了新的数据结构 Set。它类似于数组，但是成员的值都是唯一的，没有重复的值
 */
const s = new Set();

[2, 3, 5, 4, 5, 2, 2].forEach(x => s.add(x));

for (let i of s) {
    console.log(i);
}

/**
 * 2. 去除数组的重复成员
 */
const set = new Set([1, 2, 3, 4, 4]);
let new_array = [...set]
// [1, 2, 3, 4]

/**
 * 3. Set 结构的实例有四个遍历方法，可以用于遍历成员。
 */
/*keys()：返回键名的遍历器
values()：返回键值的遍历器
entries()：返回键值对的遍历器
forEach()：使用回调函数遍历每个成员
数组的map和filter方法也可以用于 Set 了*/

let set = new Set(['red', 'green', 'blue']);

for (let item of set.keys()) {
    console.log(item);
}
// red
// green
// blue

for (let item of set.values()) {
    console.log(item);
}
// red
// green
// blue

for (let item of set.entries()) {
    console.log(item);
}
// ["red", "red"]
// ["green", "green"]
// ["blue", "blue"]


let set = new Set([1, 2, 3]);
set.forEach((value, key) => console.log(value * 2) )

let set = new Set([1, 2, 3]);
set = new Set([...set].map(x => x * 2));
// 返回Set结构：{2, 4, 6}

let set = new Set([1, 2, 3, 4, 5]);
set = new Set([...set].filter(x => (x % 2) == 0));