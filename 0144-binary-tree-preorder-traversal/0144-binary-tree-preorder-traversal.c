/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

void preorder(struct TreeNode * root, int * ans , int * index){
    if(root == NULL){
        return;
    }
    ans[(*index)++] = root->val;        //root
    preorder(root->left, ans , index);  //left
    preorder(root->right, ans, index);  //right
}
int* preorderTraversal(struct TreeNode* root, int* returnSize) {
    int * ans = (int*)malloc(10000 * sizeof(int));
    *returnSize = 0;

    preorder(root, ans, returnSize);

    return ans;
}