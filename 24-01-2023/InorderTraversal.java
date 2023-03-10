class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(list,root);
        return list;
        
    }
    public void inorder(ArrayList<Integer> list,TreeNode root){
        if(root==null){
            return;
        }
        inorder(list,root.left);
        list.add(root.val);
        inorder(list,root.right);
    }
}
