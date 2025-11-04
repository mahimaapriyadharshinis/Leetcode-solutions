/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int maxDepth(struct TreeNode* root) {
    if (root == NULL) return 0;

    int c = 0, d = 0;
    struct TreeNode* temp1 = root;
    struct TreeNode* temp2 = root;

    if (temp1->right != NULL) {
        c = maxDepth(temp1->right);
    }

    if (temp2->left != NULL) {
        d = maxDepth(temp2->left);
    }

    int max = (c > d ? c : d) + 1;
    return max;
}
