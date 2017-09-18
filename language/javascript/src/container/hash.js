let obj = { a:1, b:2, c:3}
console.log(obj.a);

Object.keys(obj).forEach(key => console.log(key));
Object.values(obj).forEach(value => console.log(value));
Object.entries(obj).forEach( (key,value) => console.log(key + ":" +value));