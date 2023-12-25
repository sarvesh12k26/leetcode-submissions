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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        boolean ans = true;
        List<Integer> list1 = new ArrayList<>();
        traverse(root1, list1);
        List<Integer> list2 = new ArrayList<>();
        traverse(root2, list2);

        if(list1.size() != list2.size())
            return false;
        
        for(int i=0; i<list1.size(); i++) {
            if(list1.get(i) != list2.get(i)) {
                ans = false;
                break;
            }
        }

        return ans;

    }

    private void traverse(TreeNode node, List<Integer> nums) {
        if(node == null)
            return;
        traverse(node.left, nums);
        if(node.left == null && node.right == null)
            nums.add(node.val);
        traverse(node.right, nums);
    }
}