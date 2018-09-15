/**Author: Wenhao Lin
 *Question: Palindrome Linked List
 *Given a singly linked list, determine if it is a palindrome.
 *
 *
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class PalindromeLinkedList {
public:
    bool isPalindrome(ListNode* head) { 
        if(head ==NULL || head ->next==NULL){
            return true;
        }else{
            int length = 0;
            ListNode * temp = head;
            while(temp != NULL){
                length++;
                temp = temp->next;
                cout<<length<<endl;
            }
            temp = head;
            int half = 0;
            if(length % 2 ==0){
                half = length /2;
            }else{
                half = length /2 +1;
            }
                        
            // temp go half way
            while(half != 0){
                temp = temp -> next;
                half --;
            }
            
            half = length /2;
            bool equal = true;

            while (half!=0){
                ListNode * fronthalf = NULL;
                for(int i = 0; i < half; i++){
                    if(fronthalf == NULL){
                        fronthalf = head;
                    }else{
                    fronthalf = fronthalf->next;
                    }
                }
                if(fronthalf->val != temp->val){
                    equal = false;
                    break;
                }
                temp = temp->next;
                half--;
            }
            return equal;   
        }
    }
};