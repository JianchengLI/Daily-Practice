/**
 * 下面两种函数声明，根据 ES5 的规定都是非法的。
 * !!! 但是，浏览器没有遵守这个规定，为了兼容以前的旧代码，还是支持在块级作用域之中声明函数，因此上面两种情况实际都能运行，不会报错
 */
// 情况一
if (true) {
    //function f() {}
}

// 情况二
try {
    //function f() {}
} catch(e) {
    // ...
}



function f() { console.log('I am outside!'); }
(function () {
    if (false) {
        // 重复声明一次函数f
        //function f() { console.log('I am inside!'); }
    }

    f();
}());

/**
 * 上面代码在 ES5 中运行，会得到“I am inside!”，因为在if内声明的函数f会被提升到函数头部，实际运行的代码如下
 */
// ES5 环境
function f() { console.log('I am outside!'); }

(function () {
    function f() { console.log('I am inside!'); }
    if (false) {
    }
    f();
}());


// 浏览器的 ES6 环境
function f() { console.log('I am outside!'); }
(function () {
    var f = undefined;
    if (false) {
        //function f() { console.log('I am inside!'); }
    }

    f();
}());
// Uncaught TypeError: f is not a function


/**
 * NB: 1.应该避免在块级作用域内声明函数。如果确实需要，也应该写成函数表达式，而不是函数声明语句
 */
// 函数声明语句
{
    let a = 'secret';
    // function f() {
    //     return a;
    // }
}

// 函数表达式
{
    let a = 'secret';
    let f = function () {
        return a;
    };
}


/**
 * NB: 2. 块级作用域允许声明函数的规则，只在使用大括号的情况下成立，如果没有使用大括号，就会报错
 */
// 不报错
'use strict';
if (true) {
    //function f() {}
}

// 报错
'use strict';
// if (true)
    //function f() {}
