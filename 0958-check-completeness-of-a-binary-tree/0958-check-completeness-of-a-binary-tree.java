class Solution {
    public boolean isCompleteTree(TreeNode root) {
    if (root == null) {
        return true; // An empty tree is considered complete
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    boolean foundNull = false; // Indicates if a null node has been encountered

    while (!queue.isEmpty()) {
        TreeNode node = queue.poll();

        if (node == null) {
            foundNull = true; // Mark that a null node has been found
            continue; // Skip further processing for this node
        }

        // If a null node has been found before, but a non-null node is encountered now,
        // the tree is not complete
        if (foundNull) {
            return false;
        }

        // Enqueue the left and right children for further processing
        queue.offer(node.left);
        queue.offer(node.right);
    }

    // If the loop completes without finding any issues, the tree is complete
    return true;
}

}