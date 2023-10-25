// Problem: https://leetcode.com/problems/next-greater-element-i/description/

function nextGreaterElement(nums1: number[], nums2: number[]): number[] {
  const stack: number[] = [];
  const result: number[] = [];
  const hash = new Map<number, number>();
  for(let i = 0; i < nums2.length; i++) {
      const num = nums2[i];
      while(stack.length > 0 && stack[stack.length - 1] <  num) {
          const val = stack.pop() as number;
          hash.set(val, num);
      }
      stack.push(num);
  }
  while(stack.length > 0) {
      const val = stack.pop() as number;
      hash.set(val, -1);
  }
  for(let i = 0; i < nums1.length; i++) {
      result.push(hash.get(nums1[i]));
  }
  return result;
};
