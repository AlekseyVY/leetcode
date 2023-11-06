// Problem: https://leetcode.com/problems/defanging-an-ip-address/description/


class Solution {
    public String defangIPaddr(String address) {
        String ip = "[.]";
        char dot = '.';
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if(ch == dot) {
                result.append(ip);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
