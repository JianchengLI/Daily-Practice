/**
 * Airbnb的JavaScript风格规范
 */
/**
 * 1.块级作用域
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
 * 2.字符串
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
 * 3.解构赋值
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
