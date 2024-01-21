class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode a = null, b = null;
        int len = Length(head);
        ListNode temp = head;
        for (int i = 0; i < len; i++) {
            if (i == k - 1)
            {
                a = temp;
            }
            if (i == len - k)
            {
                b = temp;
            }
            temp = temp.next;
        }
        int temp1 = a.val;
        a.val = b.val;
        b.val = temp1;
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