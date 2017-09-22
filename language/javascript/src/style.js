/**
 * Airbnb的JavaScript风格规范
 */
/**
 * 1. 块级作用域
 */
// 1.1 let 取代 var
// let完全可以取代var，因为两者语义相同，而且let没有副作用

// 1.2 全局常量和线程安全
// 在let和const之间，建议优先使用const，尤其是在全局环境，不应该设置变量，只应设置常量
// bad
var a = 1, b = 2, c = 3;

// good
const a = 1;
const b = 2;
const c = 3;

// best
const [a, b, c] = [1, 2, 3];

/**
 * 2. 字符串
 */
// 静态字符串一律使用单引号或反引号，不使用双引号。动态字符串使用反引号
// bad
const a = "foobar";
const b = 'foo' + a + 'bar';

// acceptable
const c = `foobar`;

// good
const a = 'foobar';
const b = `foo${a}bar`;
const c = 'foobar';

/**
 * 3. 解构赋值
 */
// 使用数组成员对变量赋值时，优先使用解构赋值
const arr = [1, 2, 3, 4];

// bad
const first = arr[0];
const second = arr[1];

// good
const [first, second] = arr;

// 函数的参数如果是对象的成员，优先使用解构赋值
// bad
function getFullName(user) {
    const firstName = user.firstName;
    const lastName = user.lastName;
}

// good
function getFullName(obj) {
    const { firstName, lastName } = obj;
}

// best
function getFullName({ firstName, lastName }) {
}

/**
 * 4. 对象
 */
// 单行定义的对象，最后一个成员不以逗号结尾。多行定义的对象，最后一个成员以逗号结尾
// bad
const a = { k1: v1, k2: v2, };
const b = {
    k1: v1,
    k2: v2
};

// good
const a = { k1: v1, k2: v2 };
const b = {
    k1: v1,
    k2: v2,
};

// 对象的属性和方法，尽量采用简洁表达法，这样易于描述和书写
var ref = 'some value';

// bad
const atom = {
    ref: ref,

    value: 1,

    addValue: function (value) {
        return atom.value + value;
    },
};

// good
const atom = {
    ref,

    value: 1,

    addValue(value) {
        return atom.value + value;
    },
};

/**
 * 5. 数组
 */
// 使用扩展运算符（...）拷贝数组
// bad
const len = items.length;
const itemsCopy = [];
let i;

for (i = 0; i < len; i++) {
    itemsCopy[i] = items[i];
}

// good
const itemsCopy = [...items];

/**
 * 6. 函数
 */
// 立即执行函数可以写成箭头函数的形式
(() => {
    console.log('Welcome to the Internet.');
})();

// 那些需要使用函数表达式的场合，尽量用箭头函数代替。因为这样更简洁，而且绑定了this
// bad
[1, 2, 3].map(function (x) {
    return x * x;
});

// good
[1, 2, 3].map((x) => {
    return x * x;
});

// best
[1, 2, 3].map(x => x * x);

/**
 * 7. Map结构
 */
// 注意区分Object和Map，只有模拟现实世界的实体对象时，
// 才使用Object。如果只是需要key: value的数据结构，使用Map结构。因为Map有内建的遍历机制
let map = new Map(arr);

for (let key of map.keys()) {
    console.log(key);
}

for (let value of map.values()) {
    console.log(value);
}

for (let item of map.entries()) {
    console.log(item[0], item[1]);
}

/**
 * 8. Class
 */
// 总是用Class，取代需要prototype的操作。因为Class的写法更简洁，更易于理解
function Queue(contents = []) {
    this._queue = [...contents];
}
Queue.prototype.pop = function() {
    const value = this._queue[0];
    this._queue.splice(0, 1);
    return value;
}

// good
class Queue {
    constructor(contents = []) {
        this._queue = [...contents];
    }
    pop() {
        const value = this._queue[0];
        this._queue.splice(0, 1);
        return value;
    }
}


//使用extends实现继承，因为这样更简单，不会有破坏instanceof运算的危险
// bad
const inherits = require('inherits');
function PeekableQueue(contents) {
    Queue.apply(this, contents);
}
inherits(PeekableQueue, Queue);
PeekableQueue.prototype.peek = function() {
    return this._queue[0];
}

// good
class PeekableQueue extends Queue {
    peek() {
        return this._queue[0];
    }
}

// good
class PeekableQueue extends Queue {
    peek() {
        return this._queue[0];
    }
}

/**
 * 9. 模块
 * 首先，Module语法是JavaScript模块的标准写法，坚持使用这种写法。使用import取代require
 */
// bad
const moduleA = require('moduleA');
const func1 = moduleA.func1;
const func2 = moduleA.func2;

// good
import { func1, func2 } from 'moduleA';

// 使用export取代module.exports
// commonJS的写法
var React = require('react');

var Breadcrumbs = React.createClass({
    render() {
        // return <nav />;
    }
});

module.exports = Breadcrumbs;

// ES6的写法
import React from 'react';

class Breadcrumbs extends React.Component {
    render() {
        // return <nav />;
    }
};

export default Breadcrumbs;
