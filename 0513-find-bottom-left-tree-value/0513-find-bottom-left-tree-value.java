class Solution {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null)
        {
            return -1;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode leftMost = root;
        while (!queue.isEmpty())
        {
            int size = queue.size();
            leftMost = queue.peek();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null)
                {
                    queue.offer(temp.left);
                }
                if (temp.right != null)
                {
                    queue.offer(temp.right);
                }
            }
        }
        return leftMost.val;
    }
}