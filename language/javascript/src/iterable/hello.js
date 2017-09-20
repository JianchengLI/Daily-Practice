/**
  * JavaScript 原有的表示“集合”的数据结构，主要是数组（Array）和对象（Object），
  * ES6 又添加了Map和Set。这样就有了四种数据集合
  * 这样就需要一种统一的接口机制，来处理所有不同的数据结构
  * NB: ES6创造了一种新的遍历命令for...of循环，Iterator接口主要供for...of消费
 *  字符串是一个类似数组的对象，也原生具有 Iterator 接口
  */

// 下面是一个模拟next方法返回值的例子
var it = makeIterator(['a', 'b']);

it.next() // { value: "a", done: false }
it.next() // { value: "b", done: false }
it.next() // { value: undefined, done: true }

function makeIterator(array) {
    var nextIndex = 0;
    return {
        next: function() {
            return nextIndex < array.length ?
                {value: array[nextIndex++], done: false} :
                {value: undefined, done: true};
        }
    };
}
