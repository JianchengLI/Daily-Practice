/**
 * 变量的解构赋值用途
 */

/**
 * 1 交换变量的值
 */
let x = 1;
let y = 2;

[x, y] = [y, x];

/**
 * 2 从函数返回多个值
 */
function example() {
    return [1, 2, 3];
}
let [a, b, c] = example();

// 返回一个对象

function example() {
    return {
        foo: 1,
        bar: 2
    };
}
let { foo, bar } = example();

/**
 * 3. 函数参数的定义, like ruby options = {}
 */
// 参数是一组有次序的值
function f([x, y, z]) {}
f([1, 2, 3]);

// 参数是一组无次序的值
function f({x, y, z}) {}
f({z: 3, y: 2, x: 1});

/**
 * 4 提取JSON数据
 */
let jsonData = {
    id: 42,
    status: "OK",
    data: [867, 5309]
};

let { id, status, data: number } = jsonData;

/**
 * 5. 遍历Map结构
 */
var map = new Map();
map.set('first', 'hello');
map.set('second', 'world');

for (let [key, value] of map) {
    console.log(key + " is " + value);
}

// 如果只想获取键名，或者只想获取键值
// 获取键名
for (let [key] of map) {
    // ...
}

// 获取键值
for (let [,value] of map) {
    // ...
}
