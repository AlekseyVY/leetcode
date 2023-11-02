// Problem: https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/description/?envType=daily-question&envId=2023-11-02

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int equals = 0;
    public int averageOfSubtree(TreeNode root) {
        int[] arr = new int[2];
        dfs(root);
        return equals;
    }

    public int[] dfs(TreeNode root) {
        if(root == null) {
            return new int[]{0, 0};
        };
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int nodeSum = left[0] + right[0] + root.val;
        int count = left[1] + right[1] + 1;
        int avg = nodeSum / count;
        if(avg == root.val) equals++;
        return new int[]{nodeSum, count};
    }
}
