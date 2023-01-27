class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root==null)
            return list;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        int a=root.val;
        while(!queue.isEmpty()){
            ArrayList<Integer>  l = new ArrayList<Integer>();
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode cur = queue.poll();
                l.add(cur.val);
                if(cur.left!=null){
                    queue.add(cur.left);
                }
                if(cur.right!=null){
                    queue.add(cur.right);
                }
            }
            list.add(l);
        }
        return list;
        
    }
}
