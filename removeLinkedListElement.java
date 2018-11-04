/**Author: Wenhao Lin
 *Question: Remove all elements from a linked list of integers that have value val.
 *Example:
 *   
 *Input:  1->2->6->3->4->5->6, val = 6
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null; 
        List <Integer> list = new ArrayList<Integer>();
        
        //get unique elements and store in array list
        while(head != null){
            if(head.val != val){
                list.add(head.val);
            }
            head = head.next;
        }//while
        
        if(list.size()==0) return null;
        
        //insert
        ListNode firstNode = new ListNode(list.get(0));
        head = firstNode;
        ListNode temp = firstNode;
        for(int i = 1; i < list.size(); i++){
            ListNode node = new ListNode(list.get(i));
            temp.next = node;
            temp=temp.next;
        }
        return head;
    }
}