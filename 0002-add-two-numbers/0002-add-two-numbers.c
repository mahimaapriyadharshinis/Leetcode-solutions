/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {

    struct ListNode* s1 = l1;
    struct ListNode* s2 = l2;

    struct ListNode* head = NULL;
    struct ListNode* tail = NULL;

    int carry = 0;

    while (s1 != NULL || s2 != NULL || carry) {

        int x = (s1 != NULL) ? s1->val : 0;
        int y = (s2 != NULL) ? s2->val : 0;

        int sum = x + y + carry;
        carry = sum / 10;

        struct ListNode* node = (struct ListNode*)malloc(sizeof(struct ListNode));
        node->val = sum % 10;
        node->next = NULL;

        if (head == NULL) {
            head = node;
            tail = node;
        } else {
            tail->next = node;
            tail = node;
        }

        if (s1 != NULL) s1 = s1->next;
        if (s2 != NULL) s2 = s2->next;
    }

    return head;
}
