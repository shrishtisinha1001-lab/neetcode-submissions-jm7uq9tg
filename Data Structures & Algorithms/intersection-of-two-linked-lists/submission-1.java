public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lenA = getListLength(headA);
        int lenB = getListLength(headB);

        // Move the longer list's head forward
        // until both lists have the same remaining length
        while (lenA > lenB) {
            lenA--;
            headA = headA.next;
        }

        while (lenB > lenA) {
            lenB--;
            headB = headB.next;
        }

        // Now both heads are at the same distance
        // from the intersection point
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    // Calculate length of a linked list
    private int getListLength(ListNode head) {
        int length = 0;

        while (head != null) {
            length++;
            head = head.next;
        }

        return length;
    }
}