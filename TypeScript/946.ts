// Problem: https://leetcode.com/problems/validate-stack-sequences/

function validateStackSequences(pushed: number[], popped: number[]): boolean {
  const stack: number[] = [];
  let idx = 0;
  for(let i = 0; i < pushed.length; i++) {
      stack.push(pushed[i])
      while(stack.length > 0 && popped[idx] === stack[stack.length - 1]) {
          stack.pop();
          idx++;
      }
  }
  return stack.length === 0
};
