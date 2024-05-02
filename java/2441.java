// Problem: https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/


class Solution {
  public int findMaxK(int[] nums) {
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
      Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
      for (Integer num : set) {
          int key = Math.abs(num);
          map.put(key, map.getOrDefault(key, 0) + num);
      }
      int maxKey = -1;
      for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
          Integer key = entry.getKey();
          Integer value = entry.getValue();
          if(value == 0 && maxKey < key) maxKey = key;
      }
      return maxKey;
  }
}
