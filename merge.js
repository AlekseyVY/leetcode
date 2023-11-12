const { createInterface } = require("readline");

const rl = createInterface({
  input: process.stdin,
  output: process.stdout,
});

const inputs = [];

rl.on("line", (data) => {
  inputs.push(data);
  if (inputs.length !== 4) return;
  const result = [];
  if (inputs.length === 4) {
    const arr1 = inputs[1].split(" ").filter(Boolean);
    const arr2 = inputs[3].split(" ").filter(Boolean);
    let idx = 0;
    arr1.forEach((num) => {
      if (arr2[idx] > num) {
        result.push(num);
      } else {
        result.push(arr2[idx]);
        idx++;
      }
    });
  }
  console.log(result);
  process.exit(0);
});
