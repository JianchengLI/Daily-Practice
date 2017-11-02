/**
 * ES2015 中的 import 和 export 语句已经被标准化。虽然大多数浏览器还无法支持它们，但是 webpack 却能够提供开箱即用般的支持。
 */
import _ from 'lodash'; // Solution
import print from './print';

function component() {
    var element = document.createElement('div');
    var btn = document.createElement('button');

    // Lodash（目前通过一个 script 脚本引入）对于执行这一行是必需的
    element.innerHTML = _.join(['Hello', 'webpack']); // Solution. Lodash, now imported by this script

    btn.innerHTML = 'Click me and check the console!';
    btn.onclick = print;

    element.appendChild(btn);

    /**
     * Problem:
     * 使用这种方式去管理 JavaScript 项目会有一些问题：
     *  - 并未显式声明需要引入 lodash，只是假定推测已经存在一个全局变量 _
     *  - 无法立即体现，脚本的执行依赖于外部扩展库(external library)。
     *  - 如果依赖不存在，或者引入顺序错误，应用程序将无法正常运行。
     *  - 如果依赖被引入但是并没有使用，浏览器将被迫下载无用代码
     *  
     * Solution:
     *  - 源”代码(/src)从我们的“分发”代码(/dist)中分离出来。“源”代码是用于书写和编辑的代码。“分发”代码是构建过程产生的代码最小化和优化后的“输出”目录，最终将在浏览器中加载
     *  - 要在 index.js 中打包 lodash 依赖，我们需要在本地安装 library。 npm install --save lodash
     */
    return element;
}

document.body.appendChild(component());