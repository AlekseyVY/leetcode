// Problem: https://leetcode.com/problems/moving-average-from-data-stream/

class MovingAverage {
  private queue: number[];
  private size: number;
  constructor(size: number) {
      this.queue = new Array(size);
      this.size = size;
  }

  next(val: number): number {
      if(this.queue.length === this.size) {
          this.queue.shift();
          this.queue.push(val);
      } else {
          this.queue.push(val);
      }
      return this.queue.reduce((acc, val) => acc + val ,0) / this.queue.length
  }
}
