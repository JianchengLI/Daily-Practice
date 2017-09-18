[1, 2, 3, 4, 5].forEach(x => {console.log(x)});

let letter = ['a', 'b', 'c'];
let entries = letter.keys();
console.log(entries.next().value); // 0
console.log(entries.next().value); // 1
console.log(entries.next().value); // 2

// entries = letter.values();
// console.log(entries.next().value); // [0, 'a']
// console.log(entries.next().value); // [1, 'b']
// console.log(entries.next().value); // [2, 'c']

entries = letter.entries();
console.log(entries.next().value); // [0, 'a']
console.log(entries.next().value); // [1, 'b']
console.log(entries.next().value); // [2, 'c']