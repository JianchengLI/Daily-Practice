/**
 * const声明一个只读的常量。一旦声明，常量的值就不能改变
 * const实际上保证的，并不是变量的值不得改动，而是变量指向的那个内存地址不得改动
 */

const PI = 3.1415;
PI // 3.1415
//PI = 3;

const foo = {};

// 为 foo 添加一个属性，可以成功
foo.prop = 123;
foo.prop // 123

// 将 foo 指向另一个对象，就会报错
//foo = {}; // TypeError: "foo" is read-only

/**
 * 除了将对象本身冻结，对象的属性也应该冻结。下面是一个将对象彻底冻结的函数
 */
var constantize = (obj) => {
    Object.freeze(obj);
    Object.keys(obj).forEach( (key, i) => {
        if ( typeof obj[key] === 'object' ) {
            constantize( obj[key] );
        }
    });
};

