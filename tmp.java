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
                TreeNode node = que.pollFirst();
                if(node != null) {
                     if(leftToRight) {
                        inner.addLast(node.val);
                     } else {
                        inner.addFirst(node.val);
                     }
                        if(node.right != null) {
                            que.addLast(node.right);
                        }
                        if(node.left != null) {
                            que.addLast(node.left);
                        }
                    }
                }

            }
            leftToRight = !leftToRight;
            list.add(inner);
        }
        return list;
    }
}
