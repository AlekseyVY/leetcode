const { createInterface } = require("readline");

const rl = createInterface({
  input: process.stdin,
  output: process.stdout,
});

const inputs = [];

rl.on("line", (data) => {
  inputs.push(data);
  if (inputs.length !== 2) return;
  let array;
  if (inputs.length == 2) {
    array = inputs[1].split(" ");
    array.sort((a, b) => +a - +b);
  }
  console.log(array.join(" "));
  process.exit(0);
});
