/**Author: Wenhao Lin
 * Question: Binary tree preorder traversal
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root, list);
        return list;
    }
    
    public static void helper(TreeNode root, List<Integer> list) {
        if(root != null) {
            list.add(root.val);
             helper(root.left, list);
            helper(root.right, list);
        }
    }
}