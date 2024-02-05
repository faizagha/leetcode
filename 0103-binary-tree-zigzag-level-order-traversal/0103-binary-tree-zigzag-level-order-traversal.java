class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    if (root == null){
        return list;
    }
    Deque<TreeNode> q = new LinkedList<>();
    q.offer(root);
    boolean reverse = false;
    while (!q.isEmpty()){
        int listSize = q.size();
        List<Integer> temp = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            if (!reverse){
                TreeNode curr = q.pollFirst();
                temp.add(curr.val);
                if (curr.left != null){
                    q.addLast(curr.left);
                }
                if (curr.right != null){
                    q.addLast(curr.right);
                }
            }else{
                TreeNode curr = q.pollLast();
                temp.add(curr.val);
                if (curr.right != null){
                    q.addFirst(curr.right);
                }
                if (curr.left != null){
                    q.addFirst(curr.left);
                }
            }
        }
    reverse = !reverse;    
    list.add(temp);
    }
    
    return list;
    }
    
}