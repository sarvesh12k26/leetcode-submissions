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
    private int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        traverse(root, false);
        return sum;
    }

    private void traverse(TreeNode node, boolean add) {
        if(node == null)
            return;
        
        traverse(node.left, true);
        if(add == true && node.left == null && node.right == null)
            sum += node.val;
        traverse(node.right,false);
    }
}