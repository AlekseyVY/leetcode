// Problem https://leetcode.com/problems/boats-to-save-people/


class Solution {
  public int numRescueBoats(int[] people, int limit) {
      Arrays.sort(people);
      int l = 0, r = people.length - 1;
      int boats = 0;
      while(l <= r) {
          int lx = people[l];
          int rx = people[r];
          if((lx + rx) <= limit) {
              boats++;
              l++;
              r--;
          } else {
              boats++;
              r--;
          }
      }
      return boats;
  }
}
