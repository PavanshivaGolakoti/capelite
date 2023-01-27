class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        if(targetSum==root.val && root.left==null && root.right==null )
            return true;
        boolean a=hasPathSum(root.left,targetSum-root.val);
        boolean b=hasPathSum(root.right,targetSum-root.val);
        if(a || b)
            return true;
        return false;
        
    }
}
