class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
        {
            return 0;
        }
        int max = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            int size = queue.size();
            for (int i = 0; i < size; i++)
            {
                TreeNode curr = queue.poll();
                if (curr.left != null)
                {
                    queue.offer(curr.left);
                }
                if (curr.right != null)
                {
                    queue.offer(curr.right);
                }
            }
            max++;
        }
        return max;
    }
}