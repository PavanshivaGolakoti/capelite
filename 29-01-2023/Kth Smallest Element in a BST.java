class Solution {
    public int kthSmallest(TreeNode root, int k) {
        result(root);
        Collections.sort(list);
        return list.get(k-1);
    }
    List<Integer> list = new ArrayList<>();
    public void result(TreeNode root){
        if(root==null)
        return ;
        list.add(root.val);
        result(root.right);
        result(root.left);
    }
}
