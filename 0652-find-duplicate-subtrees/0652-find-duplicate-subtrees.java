class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> duplicateSubTrees = new ArrayList<>();
        Map<String, Integer> Map = new HashMap<>();
        postorder(root, Map, duplicateSubTrees);
        return duplicateSubTrees;
    }

    private String postorder(TreeNode root, Map<String, Integer> map, List<TreeNode> duplicateSubTrees) {
        if (root == null)
        {
            return "#";
        }
        String left = postorder(root.left, map, duplicateSubTrees);
        String right = postorder(root.right, map, duplicateSubTrees);

        String subtree = root.val + "," + left + "," + right;
        map.put(subtree, map.getOrDefault(subtree, 0) + 1);
        if (map.get(subtree) == 2)
        {
            duplicateSubTrees.add(root);
        }
        return subtree;
    }

}
