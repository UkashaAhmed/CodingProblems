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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode right = head;
        ListNode left = head;

        // moving the right pointer from head to all the way upto the nth position
        for (int i = 0; i < n; i++) {
            right = right.next;
        }

        // if right has reached the null, it means the nth element from the end is actually the first element of the linked list
        // therefore we are simply going to return the head.next (second node) and that should be treated as the new starting point of the linked list
        if (right == null) {
            return head.next;
        }

        // else while right.next is not null, keep moving both left and right pointers one node at a time
        while (right.next != null) {
            right = right.next;
            left = left.next;
        }

        // finally you have reached to the point where your left pointer is one node behind the nth node from the end
        // therefore you simply set the left node's next to its next.next
        // and thats how you unlinked the nth node from the end
        left.next = left.next.next;

        return head;
    }
}
