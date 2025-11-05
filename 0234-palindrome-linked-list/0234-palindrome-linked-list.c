/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode* prev = NULL;
    struct ListNode* curr = head;
    struct ListNode* nextNode = NULL;
    while (curr != NULL) {
        nextNode = curr->next;
        curr->next = prev;
        prev = curr;
        curr = nextNode;
    }
    return prev;
}

bool isPalindrome(struct ListNode* head) {
    if (head == NULL || head->next == NULL) 
        return true;
    struct ListNode* slow = head;
    struct ListNode* fast = head;
    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;
    }
    struct ListNode* secondHalf = reverseList(slow);
    struct ListNode* firstHalf = head;
    struct ListNode* check = secondHalf;
    bool isPalin = true;
    while (check != NULL) {
        if (firstHalf->val != check->val) {
            isPalin = false;
            break;
        }
        firstHalf = firstHalf->next;
        check = check->next;
    }
    reverseList(secondHalf);
    return isPalin;
}