// Problem: https://leetcode.com/problems/sort-vowels-in-a-string/description/?envType=daily-question&envId=2023-11-13

class Solution {
    public String sortVowels(String s) {
        int[] count = new int[58];
        for(char ch: s.toCharArray()) count[ch - 'A']++;
        String sortedVowels = "AEIOUaeiou";
        StringBuilder result = new StringBuilder();
        int idx = 0;
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(!isVowel(curr)) {
                result.append(curr);
            } else {
                while(count[sortedVowels.charAt(idx) - 'A'] == 0) {
                    idx++;
                };
                result.append(sortedVowels.charAt(idx));
                count[sortedVowels.charAt(idx) - 'A']--;
            }
        }
        return result.toString();
    }

    public boolean isVowel(Character ch) {
        return ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u';
    }
}
