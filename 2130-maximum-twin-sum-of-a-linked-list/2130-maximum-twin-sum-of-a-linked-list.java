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
    public int pairSum(ListNode head) {
        if (head == null || head.next == null)
        {
            return head.val;
        }
        if (head.next.next == null)
        {
            return (head.val + head.next.val);
        }
        int sum = 0;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reversedHead = reverseList(slow);
        slow.next = null;
        while (reversedHead != null)
        {
            int temp = (head.val + reversedHead.val);
            System.out.println(temp);
            sum = Math.max(temp,sum);
            reversedHead= reversedHead.next;
            head = head.next;
        }
        return sum;
    }
    
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;
        while (curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null){
                next = next.next;
            }
        }
        return prev;
    }
}