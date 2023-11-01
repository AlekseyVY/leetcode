// Problem: https://leetcode.com/problems/find-mode-in-binary-search-tree/submissions/1089330999/?envType=daily-question&envId=2023-11-01

/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */

function findMode(root: TreeNode | null): number[] {
  if(!root.left && !root.right) return [root.val]
  const hash = new Map<number, number>();
  const dfs = (root: TreeNode | null) => {
      if(!root) return root;
      hash.set(root.val, hash.get(root.val) ? hash.get(root.val) + 1 : 1);
      dfs(root.left)
      dfs(root.right)
  }
  dfs(root);
  const result: number[] = []
  let mode = 0;
  for(let [key, value] of hash) {
      mode = Math.max(mode, value)
  }
  for(let [key, value] of hash) {
      if(value === mode) result.push(key)
  }
  return result
};
