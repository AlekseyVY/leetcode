// Problem: https://leetcode.com/problems/intersection-of-two-arrays/description/

class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
      Set<Integer> set = new HashSet<>();
      Set<Integer> intersect = new HashSet<>();
      for(int i = 0; i < nums1.length; i++) {
          set.add(nums1[i]);
      }
      for(int i = 0; i < nums2.length; i++) {
          if(set.contains(nums2[i])) intersect.add(nums2[i]);
      }
      return intersect.stream().mapToInt(i -> i).toArray();
  }
}
