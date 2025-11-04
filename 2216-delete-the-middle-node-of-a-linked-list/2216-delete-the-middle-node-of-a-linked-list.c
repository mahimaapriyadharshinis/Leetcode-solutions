/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteMiddle(struct ListNode* head) {
    if (!head || !head->next) return NULL;  // if 0 or 1 node, result is NULL

    struct ListNode* temp = head;
    struct ListNode* trav = head;
    struct ListNode* head1 = trav;
    int n = 0;

    // count nodes
    while (temp != NULL) {
        temp = temp->next;
        n++;
    }

    int mid = n / 2;        // delete node at index mid (0-based)
    // move trav to node just before the middle
    for (int i = 0; i < mid - 1; i++) {
        trav = trav->next;
    }

    // unlink the middle node
    trav->next = trav->next->next;

    return head1;
}
