/**Auther: Wenhao Lin
 *Given two binary strings, return their sum (also a binary string).
 *
 *The input strings are both non-empty and contains only characters 1 or   0.
 *
 *Example 1:
 *
 *Input: a = "11", b = "1"
 *Output: "100"
 */
class Solution {
    public String addBinary(String a, String b) {
        String shortString ="";
        String longString="";
        String s="";
        int carry=0;
        if(a.length()>b.length()){    //find the shorter and longer string
            shortString=b;
            longString=a;
        }else{
            shortString=a;
            longString=b;
        }//if
        
        int diff=longString.length()-shortString.length();    //get the different in length
        while(diff>0){                                        //left fill with zeros for the shorter string
            shortString="0"+shortString;
            diff--;
        }
        for(int i =shortString.length()-1; i>=0;i--){          //from right to left
            int num1=Character.getNumericValue(shortString.charAt(i));
            int num2=Character.getNumericValue(longString.charAt(i));
            int sum = num1+num2+carry;                         //adding at index i
            if(sum==2||sum==3){                                //if sum ==2 or sum == 3; carry =1, 
                carry=1;
                s=sum%2+s;
            }else{                                              //if sum==0 or sum ==1; carry = 0
                carry=0;
                s=sum%2+s;
            }
        }
        if(carry==1){                                           //if carry ==1, need one more digit at front for overfloat
            s=1+s;
        }
        return s;
    }
}