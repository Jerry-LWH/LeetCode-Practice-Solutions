/**author: Wenhao Lin
 * 
 * Question:
 * Reverse a singly linked list
 * 
 * 
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class ReverseList {
	
public:
    ListNode* reverseList(ListNode* head) {
        if(head == NULL || head ->next==NULL){
            return head;
        }
        
        int length = 1;
        ListNode * temp = head;
        ListNode * currOfNewList = NULL;
        ListNode * NewList = NULL;
        
        while(temp->next != NULL){
            temp = temp->next;
            length++;
        }
        temp = head; //reset temp
        
        while(length !=0){
            ListNode* prev =NULL;
            ListNode* curr = head;
            while(curr ->next != NULL){  //get the last two node
                prev = curr;
                curr = curr->next;
            }
            if(NewList == NULL){
                NewList = curr;
                currOfNewList = curr;
                prev -> next =NULL;
            }else{
                currOfNewList -> next = curr;
                currOfNewList = currOfNewList -> next;
                if(length!=1){    
                    prev->next = NULL;
                 }
            }
            length--;
        }
        return NewList;
        
    }  
};
