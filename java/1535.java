// Problem: https://leetcode.com/problems/find-the-winner-of-an-array-game/?envType=daily-question&envId=2023-11-05

class Solution {
    public int getWinner(int[] arr, int k) {
        int max = 0;
        int win = 0;
        Queue<Integer> que = new LinkedList();
        for(int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            que.add(arr[i]);
        }
        if(k >= arr.length) return max;
        int a = que.remove();
        while(que.size() > 0) {
            int b = que.remove();
            if(a > b) {
                que.add(b);
                win++;
            } else {
                que.add(a);
                a = b;
                win = 1;
            }
            if(win == k || a == max) return a;
        }
        return max;
    }
}
