class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        postorder(list,root);
        return list;
        
    }
    public void postorder(ArrayList<Integer> list,TreeNode root){
        if(root==null){
            return;
        }
        postorder(list,root.left);
        postorder(list,root.right);
       list.add(root.val);
    }
    
}
