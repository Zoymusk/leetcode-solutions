/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode c=root;
        while(c!=null){
            if(p.val<c.val && q.val<c.val){
                c= c.left;
            }
            else if(p.val>c.val && q.val>c.val){
                c=c.right;
            }
            else{
                return c;
            }
        }
        return null;
    }
}