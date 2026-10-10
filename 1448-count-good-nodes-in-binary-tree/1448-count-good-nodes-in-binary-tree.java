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
    public int goodNodes(TreeNode root) {
        return dfs(root,Integer.MIN_VALUE);
    }
    private int dfs(TreeNode node,int maxsofar){
        if(node==null) return 0;
        int count=node.val>=maxsofar?1:0;
        int newmax= Math.max(maxsofar,node.val);
        return count+dfs(node.left,newmax) +dfs(node.right,newmax);
    }
}