class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
        {
            return null;
        }
        invert(root);
        return root;
    }

    private void invert(TreeNode root) {
        if (root == null)
        {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
}