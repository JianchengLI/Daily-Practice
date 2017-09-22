// function Point(x, y) {
//     this.x = x;
//     this.y = y;
// }
//
// Point.prototype.toString = function () {
//     return '(' + this.x + ', ' + this.y + ')';
// };
//
// var p = new Point(1, 2);
// console.log(p.toString());

//定义类
class Point {
    constructor(x, y) {
        this.x = x;
        this.y = y;
    }

    toString() {
        return '(' + this.x + ', ' + this.y + ')';
    }
}

let point = new Point(1,2);
console.log(point.toString());

/**
 * 1. this关键字则代表实例对象
 * 2. Point === Point.prototype.constructor
 * 3. 类的所有方法都定义在类的prototype属性上面
 * 4. 类和模块的内部，默认就是严格模式，所以不需要使用use strict指定运行模式
 * 5. 私有方法是常见需求，但 ES6 不提供，只能通过变通方法模拟实现
 */


/**
 * Class 的取值函数（getter）和存值函数（setter）
 */

class MyClass {
    constructor() {
        // ...
    }
    get prop() {
        return 'getter';
    }
    set prop(value) {
        console.log('setter: '+value);
    }
}

let inst = new MyClass();

inst.prop = 123;
// setter: 123

inst.prop
// 'getter'


