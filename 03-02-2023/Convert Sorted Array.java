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
    int i=0;
    public TreeNode sortedArrayToBST(int[] nums) {
        return res(nums,0,nums.length-1);
    }
    public TreeNode  res(int nums[],int l,int h){
        if(l>h)
        return null;
        int mid  = (l+h)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = res(nums,l,mid-1);
        node.right=res(nums,mid+1,h);
        return node;

    }
}
