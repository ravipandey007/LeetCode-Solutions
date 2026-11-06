/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

 int findLength(struct ListNode * head){
    int len = 0;
    struct ListNode * temp = head;
    while(temp != NULL){
        temp = temp->next;
        len++;
    }
    return len;
 }
 void deleteFromFirst(struct ListNode** head){
    if(*head == NULL){
        return;
    }
    struct ListNode * temp = *head;
    *head = temp->next;
    free(temp);
 }
 void deleteNode(struct ListNode **head, int posi){
    if(*head == NULL){
        return;
    }
    struct ListNode * temp = *head;
    if(posi == 0){
        deleteFromFirst(head);
        return;
    }
    for(int i = 0; temp!= NULL && i < posi - 1; i++){
        temp = temp->next;
    }
    if(temp == NULL || temp->next == NULL){
        return;
    }
    struct ListNode * next = temp->next->next;
    free(temp->next);
    temp->next = next;
 }
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {

   int x = findLength(head);
   deleteNode(&head, x-n);

   return head;
}