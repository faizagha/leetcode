class Solution {
    public TreeNode convertBST(TreeNode root) {
        List<Integer> list = inorderTraversal(root);
        convert(root, list);
        return root;
    }
    private void convert(TreeNode root, List<Integer> list) {
        if (root == null)
        {
            return;
        }
        int index = list.indexOf(root.val);
        int last = list.size() ;
        int sum = 0;
        for (int i = index; i < last; i++) {
            sum = sum + list.get(i);
        }
        root.val = sum;
        convert(root.left, list);
        convert(root.right, list);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }

        return result;
    }
}