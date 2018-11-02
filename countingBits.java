/**Author Wenhao Lin
 *Given a non negative integer number num. For every numbers i in the range 0 = i = num 
 *calculate the number of 1's in their binary representation and return them as an array.
 *
 *Example 1:
 *
 *Input: 2
 *Output: [0,1,1]
 */

class Solution {
    public int[] countBits(int num) {
        int[] myArray = new int[num+1];    
        for(int i = 0; i<= num;i++){
            int number = i;
            int ones = 0;
            while(number !=0){ 
                int reminder = number%2;   
                if(reminder==1) ones++;   //count 1's
                number = number /2;
            }    
            myArray[i]=ones;              //store number of 1's for that number
        }
        return myArray;
    }
}