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
    public int maxPathSum(TreeNode root) {
        int s[] = new int[]{Integer.MIN_VALUE};
        helper(root,s);
        return s[0];
    }
    public int helper(TreeNode node,int[] s){
        if(node == null)return 0;

        int ls = Math.max(0,helper(node.left,s)); //ignore -ve values
        int rs = Math.max(0,helper(node.right,s));

        s[0] = Math.max(s[0],node.val+ls+rs);

        return node.val + Math.max(ls,rs);
    }
}