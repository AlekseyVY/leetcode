const { createInterface } = require("readline");

const rl = createInterface({
  input: process.stdin,
  output: process.stdout,
});

const inputs = [];

rl.on("line", (data) => {
  inputs.push(+data);
  if (inputs.length > inputs[i]) process.exit(0);
});
