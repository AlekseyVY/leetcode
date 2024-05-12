// Problem: https://leetcode.com/problems/assign-cookies/description/

class Solution {
  public int findContentChildren(int[] g, int[] s) {
      Arrays.sort(g);
      Arrays.sort(s);
      int l = 0, r = 0;
      int count = 0;
      while(l < g.length && r < s.length) {
          int child = g[l];
          int cookie = s[r];
          if(child > cookie) r++;
          if(child <= cookie) {
              count++;
              l++;
              r++;
          }
      }
      return count;
  }
}
