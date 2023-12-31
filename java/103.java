// Problem: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/

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
    boolean leftToRight = true;
    List<List<Integer>> list = new ArrayList();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) {
            return list;
        }
        Queue<TreeNode> que = new LinkedList();
        que.add(root);

        while(!que.isEmpty()) {
            int len = que.size();
            List<Integer> inner = new ArrayList();

            for(int i = 0; i < len; i++) {
                TreeNode node = que.remove();
                if(node != null) {
                    if(leftToRight) {
                        inner.add(0, node.val);
                    } else {
                        inner.add(node.val);
                    }
                    if(node.right != null) {
                        que.add(node.right);
                    }
                    if(node.left != null) {
                        que.add(node.left);
                    }
                }
            }
            leftToRight = !leftToRight;
            list.add(inner);
        }
        return list;
    }
}
