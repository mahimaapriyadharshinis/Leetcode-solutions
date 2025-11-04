/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
struct TreeNode* create(int value){
    struct TreeNode* temp = (struct TreeNode*)malloc(sizeof(struct TreeNode));
    if (temp == NULL) {
        perror("malloc failed");
        exit(EXIT_FAILURE);
    }
    temp->val = value;
    temp->left = NULL;
    temp->right = NULL;
    return temp;
}

struct TreeNode* insertIntoBST(struct TreeNode* root, int val) {

    if (root == NULL) {
        return create(val);
    }
    if (val < root->val) {
        root->left = insertIntoBST(root->left, val);
    } else {
        root->right = insertIntoBST(root->right, val);
    }

    return root; 
}