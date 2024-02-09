class Solution {
    public int minDiffInBST(TreeNode root) {
        List<Integer> traversal = inorderTraversal(root);
        System.out.println(traversal);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < traversal.size() - 1; i++) {
            min = Math.min(min, (traversal.get(i+1) - traversal.get(i)));
        }
        return min;
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