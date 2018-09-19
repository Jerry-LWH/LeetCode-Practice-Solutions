/**Auther:Wenhao Lin
 *Question: Merge two sorted linked lists and return it as a new list.
 *The new list should be made by splicing together the nodes of the first two list
 *
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class MergeTwoLists {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        if(l1 == NULL && l2==NULL){
            cout<<"first"<<endl;
            return l1;
        }else if(l1 != NULL  && l2==NULL ){
            cout<<"sec"<<l1->val;
            return l1;
        }else if (l1 == NULL && l2 != NULL){
            cout<<"thir"<<l2->val;
            return l2;
        }else{
            cout<<"come";
            ListNode * head = NULL;
            if(l1->val < l2->val){
                head = l1;
                l1=l1->next;
            }else{
                head = l2;
                l2=l2->next;
            }
            cout<<head->val;
            ListNode* temHead = head;
            while(l1!=NULL && l2!=NULL){
                if(l1->val < l2->val){
                    temHead->next=l1;
                    temHead=temHead->next;
                    l1=l1->next;
                }else{
                    temHead->next=l2;
                    temHead=temHead->next;
                    l2=l2->next;
                }
            }
            cout<<"here";
            if(l1==NULL && l2!=NULL){
                temHead->next=l2;
            }else{
                temHead->next=l1;
            }
            return head;
        }
    }

};