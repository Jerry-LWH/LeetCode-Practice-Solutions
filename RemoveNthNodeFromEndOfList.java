/**Auther: Wenhao Lin
 *Given a linked list, remove the n-th node from the end of list and return its head.
 *
 *Example:
 *
 *Given linked list: 1->2->3->4->5, and n = 2.
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
            int length =0;
            ListNode temp = head;
            while(temp!=null){       //count the list length
               temp=temp.next;
               length++;
            }
            n=length-n;             //get the index of the desired node to be removed
            ListNode pre=null;
            ListNode curr=head;
            while(n>0){             //iterate to that node, curr will be pointing to that node
                pre=curr;
                curr= curr.next;
                n--;
            }
            if(pre == null){        //if pre ==null, means we are deleting the first node
                head=head.next;     //clear head   
            }else{                 
                pre.next=curr.next;  //else, we just point the pre.next to the curr.next
            }
        return head;
    }
}