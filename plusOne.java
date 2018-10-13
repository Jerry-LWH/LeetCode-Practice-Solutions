/**Auther:Wenhao Lin
 *Question: Plus One 
 *Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 *The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a    *   *single digit.
 *
 *You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 *Example 1:
 *
 *Input: [1,2,3]
 *Output: [1,2,4]
 *
 *Explanation: The array represents the integer 123.
 *
 *Example 2:
 *Input: [9,9]
 *Output: [1,0,0]
 */
 
class Solution {
    public int[] plusOne(int[] digits) {
        int myArray[] = new int[digits.length+1];   //for in case if off 99 + 1 => 100 (need a new array with one extra space)
        int carry = 0;
        int j = digits.length-1;     //star from the last digit
         
        for(int i=j; i>=0; i--){
            j--;
            int number;             
            if(i==digits.length-1){          
            number = digits[i]+1+carry;     //one add one to the last digit
            }else{
                number=digits[i]+carry;     //for all other digits, just add carry
            }
            digits[i]=number%10;            //store the reminder of number in digits[i]
            myArray[i+1]=number%10;         //also store the reminder of number in myArray[i]
            if(number==10){                 
                carry =1;                   //if number==10(overfloat)   carry =1
            }else{
                carry=0;                    //if not carry = 0
                break;
            }
        }//for
        
        if(carry==1){                        //means we have one more digit to add to the front and we need to use myArray.
            myArray[0]=1;
            return myArray;
        }else{                               //if carry ==0, means all good, just return digits[]
            return digits;
        }
    }
}