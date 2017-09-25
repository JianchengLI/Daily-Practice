/**
 * Generator 是实现状态机的最佳结构。比如，下面的clock函数就是一个状态机
 */
//
// let clock = function() {
//     let ticking = true;
//     if (ticking)
//         console.log('Tick!');
//     else
//         console.log('Tock!');
//
//     ticking = !ticking;
// }
function* clock() {
    while (true) {
        yield console.log('Tick!');
        yield console.log('Tock!');
    }
};
let a = clock();
a.next();
a.next();
a.next();
a.next();
a.next();

/**
 * 异步操作的同步化表达
 */
// function* loadUI() {
//     showLoadingScreen();
//     yield loadUIDataAsynchronously();
//     hideLoadingScreen();
// }
// var loader = loadUI();
// // 加载UI
// loader.next()
//
// // 卸载UI
// loader.next()
