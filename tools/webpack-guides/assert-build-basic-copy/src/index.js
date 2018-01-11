import _ from 'lodash'; // Solution
import './style.css';
import Icon from './icon.png';

function component() {
    var element = document.createElement('div');
    element.innerHTML = _.join(['Hello', 'webpack'], ' ');
    element.classList.add('hello');

    // 将图像添加到我们现有的 div。
    var myIcon = new Image();
    myIcon.src = Icon;
    element.appendChild(myIcon);

    return element;
    /* 
        上述所有内容中最出色之处是，以这种方式加载资源，
        你可以以更直观的方式将模块和资源组合在一起。无需依赖于含有全部资源的 /assets 目录，而是将资源与代码组合在一起。例如，类似这样的结构会非常有用
        components/my_components/ some type files
    */
}

document.body.appendChild(component());