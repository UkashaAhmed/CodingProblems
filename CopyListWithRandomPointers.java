class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> hashMap = new HashMap<>();
        Node cur = head;

        while (cur != null) {
            hashMap.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        cur = head;

        while (cur != null) {
            Node copy = hashMap.get(cur);
            copy.next = hashMap.get(cur.next);
            copy.random = hashMap.get(cur.random);
            cur = cur.next;
        }

        return hashMap.get(head);        
    }
}

/**
 * Approach: HashMap (Original Node -> Copied Node)
 *
 * This solution creates a deep copy of a linked list where each node has
 * both a 'next' pointer and a 'random' pointer.
 *
 * ---------------------------
 * HIGH-LEVEL INTERVIEW EXPLANATION
 * ---------------------------
 * The challenge is that each node’s `random` pointer may point anywhere
 * in the list — forward, backward, or even to null. So we need a way to
 * quickly know the copied version of any given original node.
 *
 * To solve this, we use a HashMap that maps:
 *
 *      originalNode  ->  copiedNode
 *
 * We do this in TWO PASSES:
 *
 * ---------------------------
 * PASS 1: Create all nodes (values only)
 * ---------------------------
 * We iterate through the list once and create a new node for every original
 * node. We store these pairs in a HashMap. At this point, the copied nodes
 * have their `val` set, but their `next` and `random` pointers are still null.
 *
 * Example:
 *      original A -> copy A'
 *      original B -> copy B'
 *      original C -> copy C'
 *
 * ---------------------------
 * PASS 2: Assign next and random pointers
 * ---------------------------
 * We iterate the list again. For each original node, we set:
 *
 *      copy.next   = map.get(original.next)
 *      copy.random = map.get(original.random)
 *
 * Because the map contains every original-to-copy mapping,
 * this correctly wires the deep copy structure with no mistakes.
 *
 * ---------------------------
 * RETURN:
 * ---------------------------
 * We return the copied version of the original head:
 *
 *      return map.get(head)
 *
 * ---------------------------
 * TIME & SPACE COMPLEXITY
 * ---------------------------
 * Time:  O(n)  -> two passes over the list
 * Space: O(n)  -> HashMap storing n mappings
 *
 * This approach is very clean and easy to reason about in an interview.
 */
