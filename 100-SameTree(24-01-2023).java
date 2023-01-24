class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null)
            return false;
         if(p.val!=q.val){
            return false;
        }
        boolean pp=isSameTree(p.left,q.left);
        boolean qq= isSameTree(p.right,q.right); 
        if(pp&&qq)
            return true;
        else{return false;}
        }
    
}
