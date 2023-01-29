class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>res = new ArrayList<>();
    List<Integer>ans = new ArrayList<>();
    
     help(root,targetSum,res,ans);
    
    return res;
    
}


public void help(TreeNode root , int targetSum , List<List<Integer>>res , List<Integer>ans){
    
    if(root == null){
        return;
    }
    
    if(root.left ==null && root.right == null){
        if(targetSum == root.val){
            List<Integer>newList = new ArrayList<>(ans);
            newList.add(root.val);
            res.add(newList);
            return;
        }
    }
    
    ans.add(root.val);
    help(root.left , targetSum-root.val , res , ans);
    help(root.right,targetSum-root.val , res,ans);
    ans.remove(ans.size()-1);
    return;
}}
