// Problem: https://leetcode.com/problems/build-an-array-with-stack-operations/description/?envType=daily-question&envId=2023-11-03

class Solution {
  public List<String> buildArray(int[] target, int n) {
      ArrayList<Integer> stack = new ArrayList<Integer>();
      ArrayList<String> dto = new ArrayList<String>();
      String push = "Push";
      String pop = "Pop";
      Set<Integer> set = new HashSet<Integer>();
      for(int i = 0; i < target.length; i++) set.add(target[i]);
      for(int i = 1; i <= n; i++) {
          stack.add(i);
          dto.add(push);
          if(!set.contains(i) && stack.size() > 0) {
              stack.remove(stack.size() - 1);
              dto.add(pop);
          }
          if(set.size() == stack.size()) return dto;
      };
      return dto;
  }
}
