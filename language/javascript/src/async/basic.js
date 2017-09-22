/**
 * ES2017 标准引入了 async 函数，使得异步操作变得更加方便。
 * async 函数是什么？一句话，它就是 Generator 函数的语法糖
 */

var fs = require('fs');

var readFile = function (fileName) {
    return new Promise(function (resolve, reject) {
        fs.readFile(fileName, function(error, data) {
            if (error) return reject(error);
            resolve(data);
        });
    });
};

var gen = function* () {
    var f1 = yield readFile('/etc/fstab');
    var f2 = yield readFile('/etc/shells');
    console.log(f1.toString());
    console.log(f2.toString());
};

//写成async函数，就是下面这样
var asyncReadFile = async function () {
    var f1 = await readFile('/etc/fstab');
    var f2 = await readFile('/etc/shells');
    console.log(f1.toString());
    console.log(f2.toString());
};
//一比较就会发现，async函数就是将 Generator 函数的星号（*）替换成async，将yield替换成await，仅此而已