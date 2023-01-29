class Solution {
    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null)
        return 0;
        if(root.val<=high && root.val>=low)
        sum+=root.val;
        rangeSumBST(root.left,low,high);
        rangeSumBST(root.right,low,high);
        return sum;
    }
}
