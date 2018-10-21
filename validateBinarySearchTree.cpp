/**Auther: Wenhao Lin
 *Question Given a binary tree, determine if it is a valid binary search tree (BST).
 *Assume a BST is defined as follows:
 *The left subtree of a node contains only nodes with keys less than the node's key.
 *The right subtree of a node contains only nodes with keys greater than the node's key.
 *Both the left and right subtrees must also be binary search trees.
 */


class Solution {
public:
    bool isValidBST(TreeNode* root) {
         return checkBST(root,NULL,NULL);
    }
    
    bool checkBST(TreeNode * root, int leftBound, int rightBound){
        if(root == nullptr) return true;
        else if (( leftBound != NULL && root->val <= leftBound )||( rightBound != NULL && root ->val >= rightBound)){
            return false;
        }else{
            return checkBST(root->left,leftBound,root->val) && checkBST(root->right,root->val,rightBound);
        }
    }
};

//Note: Better to use NULL instead of INT_MAX OR INT_MIN for the initial parameter because //if the initial root node is exactly the INT_MAX OR INT_MIN it will return false right away.
//In checkBST function, the leftBound != NULL and rightBound !=NULL prevents the check for //initial root node.