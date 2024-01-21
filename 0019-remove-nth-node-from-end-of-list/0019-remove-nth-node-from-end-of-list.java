/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    int len = Length(head);

    // Check if the head needs to be removed
    if (n == len) {
        return head.next;
    }

    // If n is 0 or greater than the length, no change is needed
    if (n == 0 || n > len) {
        return head;
    }

    // Traverse to the node before the one to be removed
    ListNode temp = head;
    for (int i = 0; i < len - n - 1; i++) {
        temp = temp.next;
    }

    // Remove the nth node
    temp.next = temp.next.next;

    return head;
}

private int Length(ListNode head) {
    int len = 0;
    while (head != null) {
        len++;
        head = head.next;
    }
    return len;
}

}