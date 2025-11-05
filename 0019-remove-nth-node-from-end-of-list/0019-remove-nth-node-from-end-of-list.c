/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode* temp=head;
    struct ListNode* temp1=head;
    struct ListNode* ans=temp1;
    int c=0;
    while(temp!=NULL){
        c++;
        temp=temp->next;
    }
    int x=c-n;
    int p=0;
    if(x==0){
        head=head->next;
        return head;
    }
    while(temp1!=NULL){
        p++;
        if(p!=x){
            temp1=temp1->next;
        }else{
            temp1->next=temp1->next->next;
            temp1=temp1->next;
            break;
        }
    }
    return ans;
}