const { createInterface } = require("readline");

const rl = createInterface({
  input: process.stdin,
  output: process.stdout,
});

const inputs = [];

rl.on("line", (data) => {
  inputs.push(data);
  if (inputs.length !== 3) return;
  const pivot = +inputs[2];
  let min = 0;
  const dto = inputs[1].split(" ").filter(Boolean);
  for (let i = 0; i < dto.length; i++) {
    if (+dto[i] < pivot) min++;
  }
  console.log(min);
  console.log(dto.length - min);
  process.exit(0);
});
