class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int r= maxDepth(root.right);
        int l = maxDepth(root.left);
        return Math.max(r,l)+1;
        
    }
}
