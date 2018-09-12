/**Author: Wenhao Lin
 *
 *Question:
 *Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class isBST {
  public boolean isValidBST(TreeNode root) {
        
        return isBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    
    public static boolean isBst(TreeNode root, int leftBound, int rightBound){
        if(root == null) return true;
        if(root.val >= rightBound || root.val <= leftBound) return false;
        
        return isBst(root.left, leftBound, root.val) && isBst(root.right, root.val, rightBound);
        
    }
}