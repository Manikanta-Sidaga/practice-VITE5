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
    int sum=0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        return false;
        if(root.left==null && root.right==null)
        return (targetSum==root.val);
        if(root.right==null)
        return hasPathSum(root.left,targetSum-root.val);
        if(root.left==null)
        return hasPathSum(root.right,targetSum-root.val);
    return hasPathSum(root.right,targetSum-root.val) || hasPathSum(root.left,targetSum-root.val);
    }
}
