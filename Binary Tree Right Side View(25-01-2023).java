class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root==null)
            return list;
        int h = height(root);
        for(int i=1;i<=h;i++){
            List<Integer> l = new ArrayList<Integer>();
            currentlevel(root,i,l);
            list.add(l.get(l.size()-1));
        }
        return list;
        
    }
    public int height(TreeNode root){
        if(root==null)
            return 0;
        int l = height(root.left);
        int r = height(root.right);
        return Math.max(l,r)+1;
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
}
