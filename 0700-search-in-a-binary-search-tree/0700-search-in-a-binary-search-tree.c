/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
struct TreeNode* searchBST(struct TreeNode* root, int x) {
    if(root == NULL){
        return 0;
    }
    if(root->val == x ){
        return root;
    }
    if(root->val < x){
        return searchBST(root->right, x);
    }
    else{
        return searchBST(root->left, x);
    }
}