/**
 * let不允许在相同作用域内，重复声明同一个变量
 */
// 报错
function f1() {
    let a = 10;
    var a = 1;
}

// 报错
function f2() {
    let a = 10;
    let a = 1;
}

function f3(arg) {
    let arg; //报错
}

function f4(arg) {
    {
        let arg; //不报错
    }
}
