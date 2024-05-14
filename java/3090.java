// Problem: https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/description/


class Solution {
  public int maximumLengthSubstring(String s) {
      int max = 0;
      for(int l = 0; l < s.length(); l++) {
          Map<Character, Integer> map = new HashMap<>();
          int r = l;
          while(r < s.length()) {
              char ch = s.charAt(r);
              if(map.containsKey(ch) && map.get(ch) == 2) {
                  break;
              } else {
                  map.put(ch, map.getOrDefault(ch, 0) + 1);
              }
              r++;
          }
          max = Math.max(max, r - l);
      }
      return max;
  }
}
