class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        preorder(list,root);
        return list;
        
    }
    public void preorder(ArrayList<Integer> list,TreeNode root){
        if(root==null){
            return;
        }
        list.add(root.val);
        preorder(list,root.left);
        preorder(list,root.right);
    }
    
}
