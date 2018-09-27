/**Auther: Wenhao Lin
 *
 *Question:Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 *If there are two middle nodes, return the second middle node.
 *
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class MiddleNode {
public:
    ListNode* middleNode(ListNode* head) {
        if(head->next == NULL){ //return head if there is only one node
            return head;
        }else{
            ListNode * fastptr=head;
            ListNode * slowptr=head;
            while(fastptr->next!=NULL&& fastptr->next->next !=NULL){    //check for two available next nodes
                fastptr=fastptr->next->next;                            //fastptr advances two node at a time
                slowptr=slowptr->next;                                  //slowptr advances one node at a time
            }//while

	    //both ptr starts at head, for odd number of nodes list, fastptr will be at end and slowptr will be righ in middle
	    //example 1+2+2=5,where 1 is initial position for fast ptr and after moving for 2 round, fastprt ends at 5 index, and slowptr
	    //will be at index 3 after 2 rounds. But for even number of nodes list. say we have 6 nodes, now slow and fastptr will be at the
	    //same position as the list with 5 nodes. however, the question need specified that if there is two middle nodes, return the second
	    //node, which means we need to return node 4, we check if there is still one node after the fastptr and advance slowptr once more
	    //on true. this is exactly what the following code is doing.
            
	    if(fastptr->next !=NULL)
                slowptr=slowptr->next;
            return slowptr;
        }
        
    }
};