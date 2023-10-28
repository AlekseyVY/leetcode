// Problem: https://leetcode.com/problems/implement-queue-using-stacks/

class MyQueue {
  private stack: number[];
  constructor() {
      this.stack = [];
  }

  push(x: number): void {
      this.stack.unshift(x);
  }

  pop(): number {
      return this.stack.pop() as number;
  }

  peek(): number {
      return this.stack[this.stack.length - 1]
  }

  empty(): boolean {
      return this.stack.length === 0;
  }
}
