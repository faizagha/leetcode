class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true; // Return true when both roots are null
        }
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }
        if (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right))
        {
            return true;
        }
        if (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left))
        {
            return true;
        }
        else return false;
    }

}
