/**
 * 字符的 Unicode 表示法
 */
console.log("\u0061");
console.log("\uD842\uDFB7");

// ES6 提供字符串实例的normalize()方法，用来将字符的不同表示方法统一为同样的形式，这称为 Unicode 正规化
console.log("\u01D1");
console.log("\u004F\u030C");
'\u01D1'.normalize() === '\u004F\u030C'.normalize();
