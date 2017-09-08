/**
 * Why ?
 * 第一种场景，内层变量可能会覆盖外层变量
 */
var tmp = new Date();

function f() {
    console.log(tmp);
    if (false) {
        var tmp = 'hello world';
    }
}
f(); // undefined

/**
 *第二种场景，用来计数的循环变量泄露为全局变量。
 */
var s = 'hello';

for (var i = 0; i < s.length; i++) {
    console.log(s[i]);
}
console.log(i); //5


/**
 * So
 * let实际上为 JavaScript 新增了块级作用域
 */
function f1() {
    let n = 5;
    if (true) {
        let n = 10;
    }
    console.log(n); // 5
}

{{{{
    {let insane = 'Hello World'}
    console.log(insane); // 报错
}}}};

//内层作用域可以定义外层作用域的同名变量。
{{{{
    let insane = 'Hello World';
    {let insane = 'Hello World'}
}}}}

/**
 * 立即执行函数表达式（IIFE）不再必要了
 */
// IIFE 写法
(function () {
    var tmp = "...";
}());

// 块级作用域写法
{
    let tmp = "...";
}


