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
	
public:{
	 ListNode* reverseList(ListNode* head) {
        if(head ==NULL || head ->next==NULL){
            return head;
        }else{
          //  ListNode * temphead = head;
            ListNode * reversedList = NULL;
            ListNode * temp = NULL;
           while(head -> next !=NULL){
               if(reversedList == NULL){   //adding first Node
                    reversedList = head;
                    temp = head;
                    head = head->next;
                    reversedList -> next = NULL;
                }else{
                    reversedList = head;
                    head = head->next; 
                    reversedList->next = temp;
                    temp=reversedList;
                 }
           }
            reversedList = head;
            reversedList ->next = temp;
            return reversedList;
        }
    }
};

/*Note:
*use if statement to check if the list is empty or only one  *node, return immediately if yes.
*Read one time the old list, keep adding to the front of new       
*list, the first node to add is the special case, get a temp            *pointer to keep track of the current first node. need to add one *more time for the last node because the while loop stop if the *head == NULL, so the last element wont be added in the loop, *need  to add it mannually outside the loop. 
*/