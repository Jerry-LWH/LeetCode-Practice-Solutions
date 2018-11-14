/** Author: Wenhao Lin
 *You are given two non-empty linked lists representing two non-negative integers.
 *The digits are stored in reverse order and each of their nodes contain a single digit. 
 *Add the two numbers and return it as a linked list.
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        String str1="";
        String str2="";
        while(l1!=null){
            str1=l1.val+str1;
            l1=l1.next;
        }
        
        while(l2!=null){
            str2=l2.val+str2;
            l2=l2.next;
        }
        
        String answer=addStrings(str1,str2);
        System.out.println(answer);
        ListNode list = null;
        ListNode temp= null;
        ListNode lastNode= new ListNode(Character.getNumericValue(answer.charAt(0)));
        //list=lastNode;
        temp=lastNode;                  
        for(int i = 1; i< answer.length();i++){
            ListNode Node= new ListNode(Character.getNumericValue(answer.charAt(i)));
            Node.next=temp;
            temp=Node;  
        }//for
        return temp; 
    }
    
    public static String addStrings(String num1, String num2) {
        if(num1.length()==0){
            return num2;  
        } else if (num2.length()==0){
            return num1;
        }
        String shortString="";
        String longString="";
        if(num1.length()>num2.length()){
            shortString=num2;
            longString=num1;
        }else{
            shortString=num1;
            longString=num2;
        }
        int carry = 0;
        String answer="";
        int longIndex= longString.length()-1;
        for(int i = shortString.length()-1; i >=0;i--){
            int number1 = Character.getNumericValue(shortString.charAt(i));
            int number2 = Character.getNumericValue(longString.charAt(longIndex));
            int result = carry+number1+number2;
            answer = result%10+answer;
            carry = result/10;
            longIndex--;
        }
        
        int index = longString.length()-shortString.length(); 
        for(int i = index-1; i>=0;i--){
            if(carry == 0){
                String remaining = longString.substring(0,i+1);
                answer = remaining + answer;
                break;
            }else{
                int number = Character.getNumericValue(longString.charAt(i));
                int result = carry + number;
                carry = result/10;
                answer = result%10+answer;
            }
        }
        if (carry ==1) answer = 1+ answer;
        return answer;
    }
}