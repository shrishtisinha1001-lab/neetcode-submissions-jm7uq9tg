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

        ListNode slow = head;
        ListNode fast = head;

        // Find the middle of the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // If the list has odd number of nodes,
        // skip the middle node
        if (fast != null) {
            slow = slow.next;
        }

        // Reverse the second half
        ListNode prev = null;
        ListNode curr = slow;

        while (curr != null) {
            ListNode temp = curr.next;

            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // Compare first half and reversed second half
        while (prev != null) {

            if (head.val != prev.val) {
                return false;
            }

            head = head.next;
            prev = prev.next;
        }

        return true;
    }
}