// Problem: https://leetcode.com/problems/repeat-string/description/

declare global {
  interface String {
      replicate(times: number): string;
  }
}

String.prototype.replicate = function(times): string {
  return new Array(times).fill(this).join('')
}
