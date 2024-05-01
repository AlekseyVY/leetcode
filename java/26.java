// Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
  public int removeDuplicates(int[] nums) {
      int idx = 1;
      for(int p = 1; p < nums.length; p++) {
          if(nums[p - 1] != nums[p]) {
              nums[idx] = nums[p];
              idx++;
          }
      }
      return idx;
  }
}
