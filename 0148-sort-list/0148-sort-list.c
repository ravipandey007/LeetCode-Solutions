/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
//Step 1 : Find the middle node
struct ListNode* middleNode(struct ListNode* head){
    struct ListNode* slow = head;
    struct ListNode* fast = head->next;

    while(fast != NULL && fast->next != NULL){
        slow = slow->next;
        fast = fast->next->next;
    }
    return slow;
}

//Step 2 : Merge two sorted linked lists 
struct ListNode* merge(struct ListNode* left, struct ListNode* right){
    struct ListNode dummy;
    struct ListNode* tail = &dummy;

    dummy.next = NULL;

    while(left != NULL && right != NULL){

        if(left->val <= right->val){
            tail->next = left;
            left = left->next;
        }else{
            tail->next = right;
            right = right->next;
        }

        tail = tail->next;
    }
    if(left != NULL){
        tail->next = left;
    }else{
        tail->next = right;
    }
    return dummy.next;
}

//Step 3 : Merge Sort
struct ListNode* mergeSort(struct ListNode* head){
    if(head == NULL || head->next == NULL){
        return head;
    }

    struct ListNode* mid = middleNode(head);

    struct ListNode* right = mid->next;

    mid->next = NULL;

    struct ListNode* left = mergeSort(head);
    right = mergeSort(right);

    return merge(left, right);
}

struct ListNode* sortList(struct ListNode* head) {
    head = mergeSort(head);

   return head;
}