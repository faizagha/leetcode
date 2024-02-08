class Solution {
    int count = 0;

    public int goodNodes(TreeNode root) {
        if (root == null) {
            return count;
        }
        int max = root.val;
        helper(root, max);
        return count;
    }

    private void helper(TreeNode node, int max) {
        if (node == null) {
            return;
        }
        if (node.val >= max) {
            count++;
            max = node.val;
        }
        helper(node.left, max);
        helper(node.right, max);
    }
}
