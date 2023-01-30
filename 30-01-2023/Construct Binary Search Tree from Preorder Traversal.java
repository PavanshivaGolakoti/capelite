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
    public TreeNode bstFromPreorder(int[] preorder) {
        int upper = Integer.MAX_VALUE;
        return binary(preorder,upper,new int[] {0});
        
    }
    TreeNode binary(int[] preorder,int upper,int[] cur){
        if(cur[0]==preorder.length)
        return null;
        if(preorder[cur[0]]>upper)
        return null;
        TreeNode root = new TreeNode(preorder[cur[0]]);
        cur[0]++;
        root.left = binary(preorder,root.val,cur);
        root.right = binary(preorder,upper,cur);
        return root;
    }
}
