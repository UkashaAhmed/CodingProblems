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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1!=null && list2!=null){
        if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
        }
        }
        if(list1==null)
            return list2;
        return list1;
    }
}
We’re given two sorted linked lists, and we want to merge them into one sorted list.

I’ll solve this using recursion.

First, I handle the base cases:

If list1 is null, I just return list2 because there’s nothing to merge from the first list.

If list2 is null, I return list1.

Otherwise, both lists are non-empty, so I compare list1.val and list2.val:

If list1.val is smaller or equal, then list1 should be the head of the merged list.
I set list1.next to the result of merging list1.next and list2, and then return list1.

Otherwise, list2.val is smaller, so list2 becomes the head.
I set list2.next to the result of merging list1 and list2.next, and return list2.

This way, at each step I pick the smaller node and recursively merge the rest.
The time complexity is O(m + n) because we visit each node once, and the space complexity is O(m + n) because of the recursion depth.
