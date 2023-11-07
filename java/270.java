// Problem: https://leetcode.com/problems/closest-binary-search-tree-value/description/

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
    double closest = Integer.MAX_VALUE;
    public int closestValue(TreeNode root, double target) {
        if(root == null) return (int)closest;
        closest = Math.abs(root.val - target) < Math.abs(closest - target)
          || (Math.abs(root.val - target) == Math.abs(closest - target) && root.val < closest) ? root.val : closest;
        if(root.val > target) {
            closestValue(root.left, target);
        }
        if(root.val < target) {
            closestValue(root.right, target);
        }
        return (int)closest;
    }
}
