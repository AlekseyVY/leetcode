// Problem: https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/description/

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
    public int result = 0;
    public int maxAncestorDiff(TreeNode root) {
        dfs(root, root.val, root.val);
        return result;
    }

    public void dfs(TreeNode node, int min, int max) {
        if(node == null) return;
        int check = Math.max(Math.abs(min - node.val), Math.abs(max - node.val));
        result = Math.max(result, check);
        min = Math.min(min, node.val);
        max = Math.max(max, node.val);
        dfs(node.left, min, max);
        dfs(node.right, min, max);
        return;
    }
}
