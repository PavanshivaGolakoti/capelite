class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        res(root1);
        res(root2);
        Collections.sort(list);
        return list;
    }
    List<Integer> list = new ArrayList<>();
    public void res(TreeNode root){
        if(root==null)
        return;
        list.add(root.val);
        res(root.left);
        res(root.right);
    }
}
