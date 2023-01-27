class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root==null)
            return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int z=-1;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> l= new ArrayList<Integer>();
            for(int i=0;i<size;i++){
                TreeNode cur = queue.poll();
                if(cur.left!=null)
                    queue.add(cur.left);
                if(cur.right!=null)
                    queue.add(cur.right);
                if(z==-1)
                    l.add(cur.val);
                else
                    l.add(0,cur.val);
                
            }
            z=z*-1;
            list.add(l);
        }
        return list;
    }
}
