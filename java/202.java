// Problem: https://leetcode.com/problems/happy-number/solutions/5143722/java-easy-solution-step-by-step-explanation/

class Solution {
  public boolean isHappy(int n) {
      int iter = 10;
      while(n != 0 && iter > 0) {
          ArrayList<Integer> l = numToDigits(n, 10);
          n = 0;
          for(int i = 0; i < l.size(); i++){
              n += (int) Math.pow(l.get(i), 2);
          }
          iter--;
          if(n == 1) return true;
      }
      return false;
  }

  public ArrayList<Integer> numToDigits(int n, int base) {
      ArrayList<Integer> d = new ArrayList<>();
      while(n != 0) {
          d.add(n % base);
          n = Math.floorDiv(n, base);
      }
      return d;
  }
}
