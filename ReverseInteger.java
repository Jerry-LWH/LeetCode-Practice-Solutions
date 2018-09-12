/*Author: Wenhao Lin
 *
 *Question:
 *Given a 32-bit signed integer, reverse digits of an integer
 *Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [-231,  231 - 1]. 
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 * */
class ReverseInteger {
	 public static int reverse(int x) {
		        int answer = 0;
		        while(x !=0){
		            int lastDigit = x%10;
		            int tempAnswer = answer*10;
		            if(tempAnswer/10!=answer) {   //check for overflow because if A*B=C, C=A/B, 
	                    answer = 0;                          //this will hold as long as there is no overfloat 
		            	break;
		            }
		            answer = tempAnswer+lastDigit;
		            x = x/10;
		        }
		        return answer;
		    }
	}
