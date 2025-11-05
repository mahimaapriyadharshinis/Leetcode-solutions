/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    struct ListNode* temp = head;
    while (temp != NULL && temp->next != NULL) {
        struct ListNode* curr = temp;
        struct ListNode* nex = temp->next;

        if (curr->val == nex->val) {
            temp->next = temp->next->next;  // remove duplicate node
        } else {
            temp = temp->next;              // move forward only if not equal
        }
    }
    return head;
}
