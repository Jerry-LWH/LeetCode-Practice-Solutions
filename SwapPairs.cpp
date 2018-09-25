/**
 *Author: Wenhao Lin
 *Question:
 *Given a linked list, swap every two adjacent nodes and return its head.
 *


 * Definition for singly-linked list.
 
 * struct ListNode {
 
 *     int val;
 
 *     ListNode *next;

 *     ListNode(int x) : val(x), next(NULL) {}

 * };
 */


class SwapPairs {

   public:
    
      ListNode* swapPairs(ListNode* head) {
        
          if(head==NULL || head->next ==NULL){
            
               return head;
        
          }else{
            
               ListNode * temphead = head;
            
               while(temphead!=NULL && temphead->next !=NULL){
                
                  int num = temphead->val;
                
                  temphead->val = temphead->next->val;
                
                  temphead->next->val = num;
                
                  temphead=temphead->next->next;
            
               }
            
               return head;
        
          }
        
    
}
};