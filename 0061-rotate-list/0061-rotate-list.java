class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
        {
            return head;
        }
        k = (k % Length(head));
        if (k == 0)
        {
            return head;
        }
        for (int i = 0; i < k; i++) {
            ListNode L = head;
            ListNode SL = head;
            while (L.next != null){
                L = L.next;
            }
            while (SL.next.next != null)
            {
                SL = SL.next;
            }
            L.next = head;
            SL.next = null;
            head = L;
        }
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