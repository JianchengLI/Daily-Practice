/**
 * 生成器（Generators）: 一个构建遍历器的更好方法
 * 一个生成器其实是一种特殊类型的函数（这个函数作为一个为迭代器工作的工厂）
 */
function* simpleGenerator(){
    yield "first";
    yield "second";
    yield "third";
    for (let i = 0; i < 3; i++)
        yield i;
}

let g = simpleGenerator();
console.log(g.next().value); // first
console.log(g.next().value); // second
console.log(g.next().value); // third
console.log(g.next().value); // 0
console.log(g.next().value); // 1
console.log(g.next().value); // 2
console.log(g.next().value); // undefined

/**
 * 一个生成器函数可以直接用作为一个类的`[Symbol.iterator]`方法，
 * 大大的减少了创建一个自定义迭代器的代码量，下面是Range重写成一个生成器
 */
function Range(low, high){
    this.low = low;
    this.high = high;
}
Range.prototype[Symbol.iterator] = function*(){
    for (let i = this.low; i <= this.high; i++) {
        yield i;
    }
};

let range = new Range(3, 5);
for (let i of range) {
    console.log(i); // prints 3, then 4, then 5 in sequence
}

function* fibonacci(limit){
    let fn1 = 1;
    let fn2 = 1;
    while (1){
        let current = fn2;
        fn2 = fn1;
        fn1 = fn1 + current;
        if (limit && current > limit) return;
        yield current;
    }
}
let sequence = fibonacci(15);
console.log(sequence.next().value); // 1
console.log(sequence.next().value); // 1
console.log(sequence.next().value); // 2
console.log(sequence.next().value); // 3
console.log(sequence.next().value); // 5
console.log(sequence.next().value); // 8
console.log(sequence.next().value); // 13
console.log(sequence.next().value); // undefined


/**
 * Generator 函数返回的遍历器对象，还有一个return方法，可以返回给定的值，并且终结遍历 Generator 函数。
 */
function* gen() {
    yield 1;
    yield 2;
    yield 3;
}

let g = gen();
g.next();        // { value: 1, done: false }
g.return('foo');// { value: "foo", done: true }
g.next();       // { value: undefined, done: true }