class Point {
    constructor(x, y) {
        this.x = x;
        this.y = y;
    }

    toString() {
        return '(' + this.x + ', ' + this.y + ')';
    }
}

class ColorPoint extends Point {
    constructor(x, y, color) {
        super(x, y); // 调用父类的constructor(x, y)
        this.color = color;
    }

    toString() {
        return this.color + ' ' + super.toString(); // 调用父类的toString()
    }
}

let point  = new ColorPoint(1,2,"white");
console.log(point.toString());

/**
 * 子类必须在constructor方法中调用super方法，否则新建实例时会报错。
 * 这是因为子类没有自己的this对象，而是继承父类的this对象
 */
