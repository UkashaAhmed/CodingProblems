class Solution {
    Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        // If already cloned, return it
        if (map.containsKey(node)) {
            return map.get(node);
        }

        // Create clone of current node
        Node clone = new Node(node.val, new ArrayList<>());
        map.put(node, clone);

        // Clone neighbors
        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }

        return clone;
    }
}
