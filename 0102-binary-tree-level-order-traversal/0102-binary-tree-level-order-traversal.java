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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> r= new ArrayList<>();
        if(root== null) return r;

        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int sl= q.size();
            List<Integer> cl= new ArrayList<>();
            for(int i=0;i<sl;i++){
                TreeNode n= q.poll();
                cl.add(n.val);
                if(n.left!=null) q.offer(n.left);
                if(n.right!=null) q.offer(n.right);
            }
            r.add(cl);
        }
        return r;
    }
}