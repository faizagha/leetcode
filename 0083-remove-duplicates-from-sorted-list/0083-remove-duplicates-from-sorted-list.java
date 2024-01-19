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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode duplicatesRemoved = new ListNode(0);
        duplicatesRemoved.next = head;
        ListNode prev = head.next;
        while (prev != null)
        {
            while (head != null && prev != null && head.val == prev.val)
            {
                prev = prev.next;
            }
            head.next = prev;
            head = prev;
            if (prev != null) 
            {
                prev = prev.next;
            }
        }
        return duplicatesRemoved.next;
    }
}