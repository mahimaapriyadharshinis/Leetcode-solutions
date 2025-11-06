/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    struct ListNode* temp = head;
    struct ListNode* ans = temp;
    struct ListNode* prev = NULL;
    struct ListNode* curr = NULL;

    while (temp != NULL) {
        curr = temp;
        if (curr->val == val) {
            if (prev == NULL) {
                ans = curr->next;
                temp = ans;
            } else {
                prev->next = curr->next;
                temp = curr->next;
            }
        } else {
            prev = curr;
            temp = temp->next;
        }
    }
    return ans;
}
