class Solution {
    TreeNode cur;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode a = new TreeNode(0);
        cur=a;
        inorder(root);
        return a.right;
    }
    public void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        root.left=null;
        cur.right=root;
        cur=root;
        inorder(root.right);
        
        
        
    }
}
