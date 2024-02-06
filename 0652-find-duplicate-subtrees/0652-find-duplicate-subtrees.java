class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> duplicateSubTrees = new ArrayList<>();
        Map<String, Integer> subtreeMap = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp == null) {
                    continue;
                }
                String subtreeKey = serialiseTree(temp);
                subtreeMap.put(subtreeKey, subtreeMap.getOrDefault(subtreeKey, 0) + 1);

                if (subtreeMap.get(subtreeKey) == 2) {
                    duplicateSubTrees.add(temp);
                }
                // Offer left and right children to the queue
                queue.offer(temp.left);
                queue.offer(temp.right);
            }
        }
        return duplicateSubTrees;
    }

    private String serialiseTree(TreeNode root) {
        if (root == null) {
            return "#";
        }
        // Serialize left and right subtrees
        String left = serialiseTree(root.left);
        String right = serialiseTree(root.right);
        // Concatenate the current node value and serialized left and right subtrees
        return root.val + "," + left + "," + right;
    }
}