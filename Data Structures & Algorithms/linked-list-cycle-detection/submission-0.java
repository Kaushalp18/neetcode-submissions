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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (slow != null) {
            int i = 2;
            while (fast != null && i > 0) {
                fast = fast.next;
                i--;
            }
            if (fast == null) {
                return false;
            }
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
