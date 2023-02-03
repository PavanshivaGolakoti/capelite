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
    ArrayList<Integer> list = new ArrayList<>();
    public void recoverTree(TreeNode root) {
        inorder(root);
        Collections.sort(list);
        recover(root);
        
    }
    public void inorder(TreeNode root){
        if(root==null)
        return ;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    int k=0;
    public void recover(TreeNode root){
        if(root==null)
        return;
        recover(root.left);
        if(root.val!=list.get(k)){
            root.val=list.get(k);
            
        }
        k++;
        recover(root.right);

    }
}
