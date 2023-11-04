// Problem: https://leetcode.com/problems/last-moment-before-all-ants-fall-out-of-a-plank/description/?envType=daily-question&envId=2023-11-04


class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int steps = 0;
        for(int i = 0; i < left.length; i++) if(left[i] > steps) steps = left[i];
        for(int i = 0; i < right.length; i++) if(n - right[i] > steps) steps = n - right[i];
        return steps;
    }
}
