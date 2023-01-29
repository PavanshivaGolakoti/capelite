class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new  ArrayList<String>();
        if(root==null)
        return list;
        String s="";
        result(root,list,s);
        return list;
    }
    public void result(TreeNode root,List<String> list,String s){
        if(root==null)
        return;
        if(root.left==null && root.right==null){
            s+=root.val;
            list.add(s);
            return;}
        else
        s+=root.val+"->";
        result(root.left,list,s);
        result(root.right,list,s);
        s=s.substring(0,s.length()-1);
        return ;


        }
    }
