// Problem: https://leetcode.com/problems/concatenation-of-array/description/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] concat = Arrays.copyOf(nums, nums.length * 2);
        System.arraycopy(nums, 0, concat, nums.length, nums.length);
        return concat;
    }
}
