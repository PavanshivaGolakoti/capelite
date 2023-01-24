class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(isSameTree(root.left,root.right))
            return true;
        return false;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null)
            return false;
         if(p.val!=q.val){
            return false;
        }
        boolean pp=isSameTree(p.left,q.right);
        boolean qq= isSameTree(p.right,q.left); 
        if(pp&&qq)
            return true;
        else{return false;}
        }
}
