/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

 int ans = 0;
 int count = 0;

 void inOrder(struct TreeNode* root, int k){
    if(root == NULL){
        return;
    }
    inOrder(root->left, k);
    count++;
    if(count == k){
        ans = root->val;
        return;
    }
    inOrder(root->right, k);
 }
int kthSmallest(struct TreeNode* root, int k) {

    count = 0;
    ans = 0;
   
   inOrder(root , k);

   return ans;
}