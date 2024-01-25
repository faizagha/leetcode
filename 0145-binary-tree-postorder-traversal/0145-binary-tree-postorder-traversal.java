class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
        {
            return result;
        }
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode root, List<Integer> result) {
        if (root == null)
        {
            return;
        }
        preorder(root.left, result);
        preorder(root.right, result);
        result.add(root.val);
    }
}