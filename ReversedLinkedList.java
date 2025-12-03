class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next; // save next
            curr.next = prev;              // reverse pointer
            prev = curr;                   // move prev forward
            curr = nextNode;               // move curr forward
        }

        return prev; // new head
    }
}


/**
 * To reverse a linked list, I use three pointers: prev, current, and next.
 * 
 * I start with:
 *   prev = null
 *   current = head
 *
 * While current is not null:
 *   1. Save the next node: next = current.next
 *   2. Reverse the pointer: current.next = prev
 *   3. Move prev forward: prev = current
 *   4. Move current forward: current = next
 *
 * When the loop ends, prev will be pointing to the new head of the reversed list,
 * so I return prev.
 */
