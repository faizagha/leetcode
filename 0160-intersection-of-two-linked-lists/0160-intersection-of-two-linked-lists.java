public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB)
        {
            return headA;
        }
        while (headA != null)
        {
            ListNode tempheadB = headB;
            while (tempheadB != null)
            {
                if (headA == tempheadB)
                {
                    return headA;
                }
                tempheadB = tempheadB.next;
            }
            headA = headA.next;
        }
        return null;
    }
}