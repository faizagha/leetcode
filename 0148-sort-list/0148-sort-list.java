class Solution {
    public ListNode sortList(ListNode head) {
    ListNode sorted = new ListNode(0);
    int[] val = new int[Length(head)];
    int i = 0;
    while (head != null) {
        val[i++] = head.val;
        head = head.next;
    }
    Arrays.sort(val);
    ListNode curr = sorted;
    for (int num : val) {
        curr.next = new ListNode(num);
        curr = curr.next;
    }
    return sorted.next;  // Return the next node of the dummy node to exclude the initial dummy node
}

// Helper method to calculate the length of the linked list
private int Length(ListNode head) {
    int length = 0;
    while (head != null) {
        length++;
        head = head.next;
    }
    return length;
}

}