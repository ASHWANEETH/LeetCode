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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pret = new ArrayList<>();
        helper(root,pret);
        return pret;

    }
    private void helper(TreeNode node,List<Integer> ans){
        if(node==null)return;
        ans.add(node.val);
        helper(node.left,ans);
        helper(node.right,ans);
    }
}