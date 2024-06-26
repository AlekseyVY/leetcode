// Problem: https://leetcode.com/problems/contains-duplicate-ii/description/

class Solution {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
      Set<Integer> window = new HashSet<Integer>();
      for(int i = 0; i < nums.length; i++) {
          if(i > k) window.remove(nums[i - k - 1]);
          if(!window.add(nums[i])) return true;
      }
      return false;
  }
}
