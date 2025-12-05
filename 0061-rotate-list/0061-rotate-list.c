struct ListNode* rotateRight(struct ListNode* head, int k) {
    if (head == NULL || head->next == NULL || k == 0)
        return head;

    int c = 0;
    struct ListNode* temp = head;
    while (temp != NULL) {
        temp = temp->next;
        c++;
    }

    k = k % c;
    if (k == 0) return head;

    struct ListNode* temp1 = head;
    for (int i = 1; i < c - k; i++) {
        temp1 = temp1->next;
    }

    struct ListNode* newHead = temp1->next;

    struct ListNode* last = newHead;
    while (last->next != NULL) {
        last = last->next;
    }

    last->next = head;
    temp1->next = NULL;

    return newHead;
}
