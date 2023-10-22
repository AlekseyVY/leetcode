// Problem: https://leetcode.com/problems/design-linked-list/

class MyLinkedList {
  int size;
  ListNode head;

  public MyLinkedList() {
    this.size = 0;
    this.head = new ListNode(0);
  }

  public int get(int index) {
    if (index < 0 || index >= size)
      return -1;
    ListNode sentinel = this.head;
    for (int i = 0; i < index + 1; ++i)
      sentinel = sentinel.next;
    return sentinel.val;
  }

  public void addAtHead(int val) {
    addAtIndex(0, val);
  }

  public void addAtTail(int val) {
    addAtIndex(this.size, val);
  }

  public void addAtIndex(int index, int val) {
    if (index > this.size)
      return;
    if (index < 0)
      index = 0;
    ++size;
    ListNode sentinel = this.head;
    for (int i = 0; i < index; ++i)
      sentinel = sentinel.next;
    ListNode node = new ListNode(val);
    node.next = sentinel.next;
    sentinel.next = node;
  }

  public void deleteAtIndex(int index) {
    if (index < 0 || index >= this.size)
      return;
    size--;
    ListNode sentinel = this.head;
    for (int i = 0; i < index; ++i)
      sentinel = sentinel.next;
    sentinel.next = sentinel.next.next;
  }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
