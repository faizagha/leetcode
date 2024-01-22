class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        } else if (lists.length == 1) {
            return lists[0];
        } else if (lists.length == 2) {
            return MergeTwoSortedLists(lists[0], lists[1]);
        }

        ListNode merged = MergeTwoSortedLists(lists[0], lists[1]);

        for (int i = 2; i < lists.length; i++) {
            merged = MergeTwoSortedLists(merged, lists[i]);
        }

        return merged;
    }

    private ListNode MergeTwoSortedLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode merged = null; // Initialize merged to null
        ListNode dummy = null;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                if (merged == null) {
                    merged = new ListNode(list1.val);
                    dummy = merged;
                } else {
                    dummy.next = new ListNode(list1.val);
                    dummy = dummy.next;
                }
                list1 = list1.next;
            } else {
                if (merged == null) {
                    merged = new ListNode(list2.val);
                    dummy = merged;
                } else {
                    dummy.next = new ListNode(list2.val);
                    dummy = dummy.next;
                }
                list2 = list2.next;
            }
        }

        if (list1 != null) {
            dummy.next = list1;
        }
        if (list2 != null) {
            dummy.next = list2;
        }

        return merged;
    }
}
