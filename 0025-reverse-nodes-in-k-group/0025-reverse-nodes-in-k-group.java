class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }
        
        int length = getLength(head);
        int groups = length / k;
        if (groups == 0) {
            return head; // Not enough nodes to form a group
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        for (int i = 0; i < groups; i++) {
            ListNode toReverse = curr.next;
            ListNode temp = toReverse;
            for (int j = 1; j < k; j++) {
                temp = temp.next;
            }

            ListNode remaining = temp.next;
            temp.next = null;
            curr.next = reverseList(toReverse);
            toReverse.next = remaining;
            curr = toReverse;
        }

        return dummy.next;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    private int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
