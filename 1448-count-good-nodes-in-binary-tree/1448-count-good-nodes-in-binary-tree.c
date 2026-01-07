/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int g(struct TreeNode* root, int maxVal) {
    if (root == NULL) return 0;

    int count = 0;

    if (root->val >= maxVal) {
        count = 1;
        maxVal = root->val;
    }

    count += g(root->left, maxVal);
    count += g(root->right, maxVal);

    return count;
}

int goodNodes(struct TreeNode* root) {
    return g(root, root->val);
}
