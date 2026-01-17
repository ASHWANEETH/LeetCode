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
    public boolean isBalanced(TreeNode root) {
        boolean d[] = new boolean[]{true};
        helper(root,d);
        return d[0];
    }
    public int helper(TreeNode node,boolean[] d){
        if(node==null)return 0;
        if(!d[0])return 0;
        int lh = helper(node.left,d);
        int rh = helper(node.right,d);
        if(Math.max(lh,rh)-Math.min(lh,rh)>1)d[0]= false;
        return 1+Math.max(lh,rh);
    }
}