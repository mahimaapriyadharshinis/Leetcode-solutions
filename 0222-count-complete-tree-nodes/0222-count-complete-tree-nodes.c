#include <math.h>

int getHeight(struct TreeNode* node) {
    int h = 0;
    while (node != NULL) {
        h++;
        node = node->left;
    }
    return h;
}

int countNodes(struct TreeNode* root) {
    if (!root) return 0;

    int leftHeight = getHeight(root->left);
    int rightHeight = getHeight(root->right);

    if (leftHeight == rightHeight) {
        return (int)pow(2, leftHeight) + countNodes(root->right);
    } else {
        return (int)pow(2, rightHeight) + countNodes(root->left);
    }
}
