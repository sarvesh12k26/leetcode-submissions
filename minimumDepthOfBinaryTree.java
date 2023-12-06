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
    // int depth = 0;
    int minDepth = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        traverse(root, 1);
        return minDepth;
    }

    private void traverse(TreeNode node, int depth) {
        if(node==null)
            return;
        if(node.left == null & node.right == null) {
            minDepth = Math.min(depth, minDepth);
            return;
        }

        traverse(node.left, depth+1);
        traverse(node.right, depth+1);
    }
}