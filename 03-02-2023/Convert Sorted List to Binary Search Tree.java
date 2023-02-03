/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
        list.add(head.val);
        head=head.next;}
        return result(list,0,list.size()-1); }
        public TreeNode result(List<Integer> list,int l,int h ){
            if(l>h)
            return null;
            int mid=(l+h)/2;
            TreeNode node = new TreeNode(list.get(mid));
            node.left = result(list,l,mid-1);
            node.right = result(list,mid+1,h);
            return node;
            

        }
}
