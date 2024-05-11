// Problem: https://leetcode.com/problems/reverse-vowels-of-a-string/description/

class Solution {
  public String reverseVowels(String s) {
      int l = 0, r = s.length() - 1;
      char[] sc = s.toCharArray();
      Set<Character> v = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
      while(l < r) {
          char lc = Character.toLowerCase(s.charAt(l));
          if(v.contains(lc)) {
              char rc = Character.toLowerCase(s.charAt(r));
              while(!v.contains(rc)) {
                  r--;
                  rc = Character.toLowerCase(s.charAt(r));
              }
              char tmp = s.charAt(r);
              sc[r] = s.charAt(l);
              sc[l] = tmp
              r--;
          }
          l++;
      }
      StringBuilder sb = new StringBuilder();
      for(char ch: sc) sb.append(ch);
      return sb.toString();
  }
}
