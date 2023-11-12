

function a(from, to) {
  return function() {
    if(from <= to) {
      return from >= 10 ? String(from++) : `0${from++}`;
    }
  }
}
const x = 3;

console.log(`${x} + ${x} = ${x + x}`)

// const x = a(1, 10);
// console.log(x())
// console.log(x())
// console.log(x())
// console.log(x())
// console.log(x())
// console.log(x())
// console.log(x())
// console.log(x())
// console.log(x())
// console.log(x())
// console.log(x())
