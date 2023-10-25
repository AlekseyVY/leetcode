// Problem: https://leetcode.com/problems/online-stock-span/

class StockSpanner {
  private stack: [[number, number]];
  constructor() {
      this.stack = [[0, 0]];
  }

  next(price: number): number {
      let answer = 1;
      while(this.stack.length > 0 && this.stack[this.stack.length - 1][0] <= price) {
          answer += this.stack[this.stack.length - 1][1];
          this.stack.pop();
      }
      this.stack.push([price, answer]);
      return answer;
  }
}
