int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

struct ListNode* insertGreatestCommonDivisors(struct ListNode* head) {
    struct ListNode* curr = head;

    while (curr != NULL && curr->next != NULL) {
        int a = curr->val;
        int b = curr->next->val;
        int c = gcd(a, b);

        struct ListNode* newNode = (struct ListNode*)malloc(sizeof(struct ListNode));
        newNode->val = c;

        newNode->next = curr->next;
        curr->next = newNode;

        curr = newNode->next;
    }

    return head;
}