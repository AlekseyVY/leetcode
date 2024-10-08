// https://leetcode.com/problems/print-immutable-linked-list-in-reverse/description/

/**
 * // This is the ImmutableListNode's API interface.
 * // You should not implement it, or speculate about its implementation
 * class ImmutableListNode {
 *      printValue() {}
 *
 *      getNext(): ImmutableListNode {}
 * }
 */

function printLinkedListInReverse(head: ImmutableListNode) {
	if(head == null) return;
    printLinkedListInReverse(head.getNext());
    head.printValue();
};
