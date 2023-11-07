// Problem: https://leetcode.com/problems/eliminate-maximum-number-of-monsters/description/


class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        double[] steps = new double[dist.length];
        int killStreak = 0;
        for(int i = 0; i < dist.length; i++) {
            steps[i] = (double)dist[i] / speed[i];
        }
        Arrays.sort(steps);
        for(int i = 0; i < steps.length; i++) {
            if(killStreak >= steps[i]) return killStreak;
            killStreak++;
        }
        return killStreak;
    }
}
