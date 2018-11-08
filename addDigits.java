/**Author: Wenhao Lin
 *Question:Given a non-negative integer num, repeatedly add all its 
 *digits until the result has only one digit.
 *
 *Example:
 *
 *Input: 38
 *Output: 2 
 *Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
 */

class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int copy = num;
            num=0;
            while(copy !=0){
                num += copy% 10;
                copy /= 10;
            }    
        }
        return num;
    }
}