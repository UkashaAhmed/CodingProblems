public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
    return false;
    }
}
I keep two pointers: a slow pointer that moves one step at a time and a fast pointer that moves two steps at a time.
If the linked list has a cycle, the fast pointer will eventually ‘lap’ the slow pointer and they will meet at the same node.
If the fast pointer reaches null, that means the list ends and there is no cycle.
So, if the two pointers ever point to the same node, I return true. Otherwise, if fast reaches null, I return false.”

⏱ Time Complexity: O(n)
🧠 Space Complexity: O(1)
