void fill(struct TreeNode* root, int arr[], int *flag) {
    if (root == NULL) return;
    fill(root->left, arr, flag);
    arr[(*flag)++] = root->val;
    fill(root->right, arr, flag);
}

struct TreeNode* increasingBST(struct TreeNode* root) {

    if (root == NULL) return NULL;

    int count = 0;
    void countNodes(struct TreeNode* r) {
        if (!r) return;
        count++;
        countNodes(r->left);
        countNodes(r->right);
    }
    countNodes(root);

    int arr[count];
    int flag = 0;

    fill(root, arr, &flag);

    for (int i = 0; i < count - 1; i++) {
        for (int j = 0; j < count - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    struct TreeNode* curr = root;

    for (int i = 0; i < count; i++) {
        curr->val = arr[i];
        curr->left = NULL;
        if (i < count - 1) {
            curr->right = malloc(sizeof(struct TreeNode));
            curr = curr->right;
        }
    }
    curr->right = NULL;

    return root;
}
