/**Author: Wenhao Lin
 *
 *Question: Given two non-negative integers num1 and num2 represented as string, 
 *return the sum of num1 and num2.
 */
class Solution {
    public String addStrings(String num1, String num2) {
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