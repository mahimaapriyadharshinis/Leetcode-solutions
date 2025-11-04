/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    if (list1 == NULL) return list2;
    if (list2 == NULL) return list1;

    struct ListNode* ans = NULL;
    struct ListNode* temp1 = list1;
    struct ListNode* temp2 = list2;

    // Initialize head
    if (temp1->val < temp2->val) {
        ans = temp1;
        temp1 = temp1->next;
    } else {
        ans = temp2;
        temp2 = temp2->next;
    }

    struct ListNode* head = ans;

    while (temp1 != NULL && temp2 != NULL) {
        while (temp1 != NULL && temp2 != NULL && temp1->val <= temp2->val) {
            ans->next = temp1;
            ans = ans->next;
            temp1 = temp1->next;
        }
        while (temp1 != NULL && temp2 != NULL && temp2->val <= temp1->val) {
            ans->next = temp2;
            ans = ans->next;
            temp2 = temp2->next;
        }
    }

    if (temp1 != NULL) ans->next = temp1;
    if (temp2 != NULL) ans->next = temp2;

    return head;
}
