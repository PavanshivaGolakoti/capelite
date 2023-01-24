class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        int l = size(root.left);
        int r = size(root.right);
        if(Math.abs(l-r)<=1 && isBalanced(root.left) && isBalanced(root.right))
            return true;
        return false;
        
    }
    public int size(TreeNode root){
        if(root==null)
            return 0;
        return Math.max(size(root.left),size(root.right))+1;
        
    }
}
