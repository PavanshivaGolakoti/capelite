class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        List<Integer> li = new ArrayList<Integer>();
        int s=height(root,li);
        
        return Collections.max(li);
        }
    public int height(TreeNode root,List<Integer> li){
        if(root==null)
            return 0;
        int l = height(root.left,li);
        int r = height(root.right,li);
        li.add(l+r);
        return Math.max(l,r)+1;
    }
}
