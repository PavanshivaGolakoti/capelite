class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root==null)
        return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode cur = queue.poll();
                l.add(cur.val);
                if(cur.left!=null)
                queue.add(cur.left);
                if(cur.right!=null)
                queue.add(cur.right);
            }
            list.add(l);
        }
        Collections.reverse(list);
        return list; 
        
    }
}Binary Tree Level Order Traversal II
