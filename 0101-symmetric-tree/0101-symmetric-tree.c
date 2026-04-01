/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool isMirror(struct TreeNode* one, struct TreeNode* two) {
    if (one == NULL && two == NULL) return true;
    if (one == NULL || two == NULL) return false;

    if (one->val == two->val) {
        return isMirror(one->left, two->right) &&
               isMirror(one->right, two->left);
    } else {
        return false;
    }
}

bool isSymmetric(struct TreeNode* root) {
    if (root == NULL) return true;

    struct TreeNode *one = root->left;
    struct TreeNode *two = root->right;

    return isMirror(one, two);
}