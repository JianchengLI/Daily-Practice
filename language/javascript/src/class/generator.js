class Foo {
    constructor(...args) {
        this.args = args;
    }
    * [Symbol.iterator]() {
        for (let arg of this.args) {
            yield arg;
        }
    }
    static classMethod() {
        return 'class Method hello';
    }
}

for (let x of new Foo('hello', 'world')) {
    console.log(x);
}


/**
 * Class 的静态属性和实例属性
 */
console.log(Foo.classMethod());

Foo.prop = 1;
// 目前，只有这种写法可行，因为 ES6 明确规定，Class 内部只有静态方法，没有静态属性
