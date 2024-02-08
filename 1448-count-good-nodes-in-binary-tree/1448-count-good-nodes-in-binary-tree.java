class Solution {
    int count = 0;

    public int goodNodes(TreeNode root) {
        if (root == null) {
            return count;
        }

        // Start the recursion with the root node and its value as the maximum
        countGoodNodes(root, root.val);
        return count;
    }

    private void countGoodNodes(TreeNode node, int maxSoFar) {
        if (node == null) {
            return;
        }

        // Check if the current node is greater than or equal to the maximum value encountered so far
        if (node.val >= maxSoFar) {
            count++;
            maxSoFar = node.val; // Update the maximum value encountered so far
        }

        // Recursively process left and right subtrees
        countGoodNodes(node.left, maxSoFar);
        countGoodNodes(node.right, maxSoFar);
    }
}
