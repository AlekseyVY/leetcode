// Problem: https://leetcode.com/problems/intersection-of-two-arrays-ii/description/

class Solution {
  public int[] intersect(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int l = 0, r = 0;
      List<Integer> list = new ArrayList<>();
      while(l < nums1.length && r < nums2.length) {
          int ln = nums1[l];
          int rn = nums2[r];
          if(ln < rn) l++;
          else if(ln > rn) r++;
          else {
              list.add(ln);
              l++;
              r++;
          }
      }
      return list.stream().mapToInt(Integer::valueOf).toArray();
  }
}
