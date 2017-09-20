/**
 * 对于普通的对象，for...of结构不能直接使用，会报错，
 * 必须部署了 Iterator 接口后才能使用。
 * 但是，这样情况下，for...in循环依然可以用来遍历键名
 */
let es6 = {
    edition: 6,
    committee: "TC39",
    standard: "ECMA-262"
};

for (let e in es6) {
    console.log(e);
}
// edition
// committee
// standard

for (let e of es6) {
    console.log(e);
}
// TypeError: es6[Symbol.iterator] is not a function

// 一种解决方法是，使用Object.keys方法将对象的键名生成一个数组，然后遍历这个数组
for (var key of Object.keys(someObject)) {
    console.log(key + ': ' + someObject[key]);
}

// 另一个方法是使用 Generator 函数将对象重新包装一下
function* entries(obj) {
    for (let key of Object.keys(obj)) {
        yield [key, obj[key]];
    }
}

for (let [key, value] of entries(obj)) {
    console.log(key, '->', value);
}
// a -> 1
// b -> 2
// c -> 3

