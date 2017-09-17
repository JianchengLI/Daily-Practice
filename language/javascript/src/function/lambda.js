/**
 * ES6 允许使用“箭头”（=>）定义函数
 */

var sum = (num1, num2) => {return num1 + num2};
var sum2 = (num1, num2) =>  num1 + num2; //不带大括号则返回, 表达式超过一行需带大括号
// 等同于
// var sum = function(num1, num2) {
//     return num1 + num2;
// };

console.log(sum(1,2));
console.log(sum2(1,2));

// 正常函数写法
[1,2,3].map(function (x) {
    return x * x;
});

// 箭头函数写法
[1,2,3].map(x => x * x);

// ES6
function foo() {
    setTimeout(() => {
        console.log('id:', this.id);
    }, 100);
}

// ES5
function foo() {
    var _this = this;

    setTimeout(function () {
        console.log('id:', _this.id);
    }, 100);
}

