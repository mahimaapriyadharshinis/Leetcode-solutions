/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

void collectLeaves(struct TreeNode* root, int arr[], int *idx) {
    if (root == NULL) return;

    collectLeaves(root->left, arr, idx);

    if (root->left == NULL && root->right == NULL)
        arr[(*idx)++] = root->val;

    collectLeaves(root->right, arr, idx);
}

bool leafSimilar(struct TreeNode* root1, struct TreeNode* root2) {

    int a[200], b[200];
    int idxA = 0, idxB = 0;

    collectLeaves(root1, a, &idxA);
    collectLeaves(root2, b, &idxB);

    if (idxA != idxB) return false;

    for (int i = 0; i < idxA; i++)
        if (a[i] != b[i])
            return false;

    return true;
}
