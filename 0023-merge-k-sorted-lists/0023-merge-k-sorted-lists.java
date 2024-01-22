class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!minHeap.isEmpty()) {
            ListNode minNode = minHeap.poll();
            curr.next = minNode;
            curr = curr.next;

            if (minNode.next != null) {
                minHeap.offer(minNode.next);
            }
        }

        return dummy.next;
    }
}
