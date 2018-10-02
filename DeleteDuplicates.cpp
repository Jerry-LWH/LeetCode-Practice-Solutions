/**Auther: Lin, Wenhao
 *Question: Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class DeleteDuplicates {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        if(head == NULL || head->next==NULL){
            return head;
        }else{
            ListNode * tempHead = head;    //tempHead to iterate through
            ListNode * curr = head;        //curr pointer to maintain the "index"
            while(tempHead->next !=NULL){  //must have two Nodes remaining for comparison
                if(tempHead->val != tempHead->next->val){    // check for two node not equal
                    curr->val = tempHead->val;               //update the val in curr Node and advance it
                    curr = curr->next;
                }
                tempHead=tempHead->next;          //advance tempHead
             }
	    //update the last Node because if last two node were equal, it wouldn't get updated in above loop
	    //if last two node not equal, only the first node would get updated. so either case we need mannually 
	    //update one last val
            curr->val = tempHead->val;         
            curr ->next = NULL;   // set curr node's next to NULL to end the list.
            
            return head;
        }//else
    }
};
