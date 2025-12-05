/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int height(struct TreeNode* root) {
    if (root == NULL)
        return 0;   

    int lh = height(root->left);
    int rh = height(root->right);

    return (lh > rh ? lh : rh) + 1;
}

bool isBalanced(struct TreeNode* root) {
    if (root == NULL)
        return 1;  // empty tree is balanced

    int l = height(root->left);
    int r = height(root->right);

    int diff = l - r;
    if (diff < 0) diff = -diff; // abs

    if (diff <= 1 && isBalanced(root->left) && isBalanced(root->right))
        return 1;

    return 0;
}
