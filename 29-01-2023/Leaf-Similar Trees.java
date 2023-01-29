class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        res1(root1);
        res2(root2);
        return list1.equals(list2);
}
List<Integer> list1= new ArrayList<>();
List<Integer> list2= new ArrayList<>();

        public void res1(TreeNode root){
            if(root==null)
            return;
            if(root.left==null && root.right==null)
            list1.add(root.val);
            res1(root.left);
            res1(root.right);
            return;
        }
        public void res2(TreeNode root){
            if(root==null)
            return;
            if(root.left==null && root.right==null)
            list2.add(root.val);
            res2(root.left);
            res2(root.right);
            return;
        }
}
