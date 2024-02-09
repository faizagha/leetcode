class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
    if (root == null) {
        return null;
    }

    // Trim the left subtree recursively
    root.left = trimBST(root.left, low, high);

    // Trim the right subtree recursively
    root.right = trimBST(root.right, low, high);

    // Check if the current node's value falls within the range
    if (root.val < low) {
        // If the current node's value is less than the low bound, return its right subtree (if any)
        return root.right;
    } else if (root.val > high) {
        // If the current node's value is greater than the high bound, return its left subtree (if any)
        return root.left;
    }

    // If the current node's value is within the range, keep it unchanged
    return root;
}

}