// https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/description/

function minimumAverage(nums: number[]): number {
  const avg = [];
  nums.sort((a, b) => a - b);
  for(let i = 0; i < nums.length; i++) {
      avg.push((nums[i] + nums[nums.length - i - 1]) / 2)
  }
  return Math.min(...avg)
};
