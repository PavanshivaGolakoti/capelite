class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        int r  = minDepth(root.right);
        int l = minDepth(root.left);
        if(l==0 || r==0){
            return Math.max(r,l)+1;
        }
        return Math.min(r,l)+1;
        
    }
}
