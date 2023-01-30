/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> inmap = new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            inmap.put(inorder[i],i);
        }
        int[] cur={0};
        return construct(preorder,inorder,inmap,0,inorder.length-1,cur);
        
    }
    public TreeNode construct(int[] preorder,int[] inorder,HashMap<Integer,Integer> inmap,int is,int ie,int[] cur){
        if(cur[0]==preorder.length || is>ie)
        return null;
        TreeNode root=new TreeNode(preorder[cur[0]]);
        int in = inmap.get(preorder[cur[0]]);
        cur[0]++;
        root.left=construct(preorder,inorder,inmap,is,in-1,cur);
        root.right=construct(preorder,inorder,inmap,in+1,ie,cur);
        return root;
    }
}
