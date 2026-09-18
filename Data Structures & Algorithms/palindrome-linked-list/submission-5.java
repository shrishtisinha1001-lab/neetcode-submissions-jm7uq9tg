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
    public boolean isPalindrome(ListNode head) {

        ListNode slow = new ListNode(-1);
        slow.next = head;

        ListNode fast = head;

        // Find the middle of the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half
        ListNode prev = null;
        ListNode curr = slow.next;

        while (curr != null) {
            ListNode temp = curr.next;

            curr.next = prev;
            prev = curr;

            curr = temp;   // IMPORTANT: move curr forward
        }

        // Compare first half with reversed second half
        while (prev != null) {
            if (head.val != prev.val) {
                return false;
            }

            prev = prev.next;
            head = head.next;
        }

        return true;
    }
}
   