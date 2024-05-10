// Problem: https://leetcode.com/problems/intersection-of-two-linked-lists/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ListNode l = headA, r = headB;
      while(l != r) {
          l = l == null ? headB : l.next;
          r = r == null ? headA : r.next;
      }
      return l;
  }
}
