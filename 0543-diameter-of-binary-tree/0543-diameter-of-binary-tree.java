public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            max++;
        }
        return max;
    }

    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root != null) {
            calculateDiameter(root);
        }
        return maxDiameter;
    }

    private int calculateDiameter(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        maxDiameter = Math.max(maxDiameter, left + right);

        calculateDiameter(root.left);
        calculateDiameter(root.right);

        return 1 + Math.max(left, right);
    }
}
