// Problem: https://leetcode.com/problems/min-stack/description/

class MinStack {
  private stack: { val: number, min: number}[];
  private size: number;
  constructor() {
      this.stack = [];
      this.size = 0;
  }

  push(val: number): void {
      if(this.size === 0) {
          this.stack.push({ val, min: val })
      } else {
          this.stack.push({ val, min: Math.min(this.stack[this.size - 1].min, val)})
      }
      this.size++;
  }

  pop(): void {
      this.stack.pop();
      this.size--;
  }

  top(): number {
      return this.stack[this.size - 1].val;
  }

  getMin(): number {
      return this.stack[this.size - 1].min
  }
}
