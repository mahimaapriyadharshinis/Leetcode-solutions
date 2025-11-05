/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *detectCycle(struct ListNode *head) {
    struct ListNode* temp1 = head;
    struct ListNode* temp2 = head;

    while (temp2 != NULL && temp2->next != NULL) {
        temp1 = temp1->next;
        temp2 = temp2->next->next;

        if (temp1 == temp2) {
            struct ListNode* temp3 = head;
            while (temp3 != temp1) {
                temp3 = temp3->next;
                temp1 = temp1->next;
            }
            return temp1;
        }
    }
    return NULL;
}
