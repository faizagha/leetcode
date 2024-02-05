class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>();
        if (root == null)
        {
            return ls;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty())
        {
            int len = q.size();
            List<Integer> curr = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode temp = q.poll();
                curr.add(temp.val);
                if (temp.left != null)
                {
                    q.offer(temp.left);
                } if (temp.right != null) {
                    q.offer(temp.right);
                }

            }
            ls.add(curr);
        }
        return ls;
    }
}