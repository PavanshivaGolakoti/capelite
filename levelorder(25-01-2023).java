class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root==null)
            return list;
        int h = height(root);
        for(int i=1;i<=h;i++){
            List<Integer> l = new ArrayList<Integer>();
            currentlevel(root,i,l);
            list.add(l);
        }
        return list;
    }
        public void currentlevel(TreeNode root,int level,List<Integer> l){
            if(root==null)
                return ;
            if(level==1)
                l.add(root.val);
            else if (level>1){
                currentlevel(root.left,level-1,l);
                currentlevel(root.right,level-1,l);
            }
        }
        
    public int height(TreeNode root){
        if(root==null)
            return 0;
        int l = height(root.left);
        int r = height(root.right);
        return Math.max(l,r)+1;
    }
}
