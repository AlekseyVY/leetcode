// Problem:
// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/

class Solution {
  public int pairSum(ListNode head) {
    ListNode current = head;
    List<Integer> values = new ArrayList<>();
    while (current != null) {
      values.add(current.val);
      current = current.next;
    }
    int i = 0, j = values.size() - 1;
    int maxSum = 0;
    while (i < j) {
      maxSum = Math.max(maxSum, values.get(i) + values.get(j));
      i++;
      j--;
    }
    return maxSum;
  }
}
