// Problem: https://leetcode.com/problems/remove-element/

class Solution {
  public int removeElement(int[] nums, int val) {
      int idx = 0;
      for(int pnt = 0; pnt < nums.length; pnt++) {
          if(nums[pnt] != val) {
              nums[idx] = nums[pnt];
              idx++;
          }
      }
      return idx;
  }
}
