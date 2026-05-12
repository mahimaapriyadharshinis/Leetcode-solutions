/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {

    struct ListNode *a = headA;

    while(a != NULL) {

        struct ListNode *b = headB;

        while(b != NULL) {

            if(a == b) {
                return a;
            }

            b = b->next;
        }

        a = a->next;
    }

    return NULL;
}