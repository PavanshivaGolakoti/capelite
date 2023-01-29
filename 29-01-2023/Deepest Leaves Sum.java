class Solution {
    public int deepestLeavesSum(TreeNode root) {
        int h = height(root);
        int l=1;
        res(root,l,h);
        return sum;
    }
    int sum=0;
    public void res(TreeNode root,int l,int h){
        if(root==null)
        return;
        if(l==h)
        sum+=root.val;
        res(root.left,l+1,h);
        res(root.right,l+1,h);
    }
    public int height(TreeNode root){
        if(root==null)
        return 0;
        int l = height(root.right);
        int r  = height(root.left);
        return Math.max(l,r)+1;
    }
}
