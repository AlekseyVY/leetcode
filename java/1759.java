// Problem: https://leetcode.com/problems/count-number-of-homogenous-substrings/description/?envType=daily-question&envId=2023-11-09

class Solution {
    public int countHomogenous(String s) {
        int substr = 0;
        int count = 0;
        int MOD = (int) 1e9 + 7;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 || s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            substr = (count + substr) % MOD;
        }
        return substr;
    }
}
