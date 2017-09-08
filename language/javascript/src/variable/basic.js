let [a, b, c] = [1, 2, 3];

// 本质上，这种写法属于“模式匹配”，只要等号两边的模式相同，左边的变量就会被赋予对应的值
let [foo, [[bar], baz]] = [1, [[2], 3]];
// foo // 1
// bar // 2
// baz // 3

//如果解构不成功，变量的值就等于undefined。
let [foo] = [];
let [bar, foo] = [1]; //foo undefined

//事实上，只要某种数据结构具有 Iterator 接口，都可以采用数组形式的解构赋值。
let [x, y, z] = new Set(['a', 'b', 'c']);
function* fibs() {
    let a = 0;
    let b = 1;
    while (true) {
        yield a;
        [a, b] = [b, a + b];
    }
}

let [first, second, third, fourth, fifth, sixth] = fibs();
//sixth // 5