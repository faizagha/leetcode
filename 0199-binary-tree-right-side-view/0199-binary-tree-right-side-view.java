class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        if (root == null)
        {
            return ls;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty())
        {
            int size = queue.size();
            int tempNum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                tempNum = temp.val;
                if (temp.left != null)
                {
                    queue.offer(temp.left);
                }
                if (temp.right != null)
                {
                    queue.offer(temp.right);
                }
            }
            ls.add(tempNum);
        }
        return ls;
    }
}