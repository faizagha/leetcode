class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] Pairs = new ListNode[k];
        if (k > Length(head))
        {
            int i = 0;
            while (head != null)
            {
                Pairs[i] = new ListNode(head.val);
                head = head.next;
                i++;
            }
            return Pairs;
        }
        int extra = Length(head) % k;
        int space = Length(head) / k;
        ListNode curr = head;
        for (int i = 0; i < k; i++) {
            Pairs[i] = curr;
            int partLength = space + (i < extra ? 1 : 0);
            for (int j = 0; j < partLength - 1; j++) {
                curr = curr.next;
            }
            if (curr != null)
            {
                ListNode next = curr.next;
                curr.next = null;
                curr = next;
            }
        }
        return Pairs;
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