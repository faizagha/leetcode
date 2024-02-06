class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
    List<TreeNode> duplicates = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();
    postorder(root, map, duplicates);
    return duplicates;
}

private String postorder(TreeNode node, Map<String, Integer> map, List<TreeNode> duplicates) {
    if (node == null) return "#"; // Serialize null nodes

    // Serialize left and right subtrees
    String left = postorder(node.left, map, duplicates);
    String right = postorder(node.right, map, duplicates);

    // Serialize the current subtree
    String subtree = node.val + "," + left + "," + right;

    // Update the frequency of the subtree serialization
    map.put(subtree, map.getOrDefault(subtree, 0) + 1);

    // If the frequency becomes 2, add the current node to duplicates list
    if (map.get(subtree) == 2) {
        duplicates.add(node);
    }

    return subtree;
}

}
