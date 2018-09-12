/* Quesion:
*Return an array that contains exactly the same numbers as the given array,
* but rearranged so that every 3 is immediately followed by a 4.
* Do not move the 3's, but every other number may move.
* The array contains the same number of 3's and 4's, every 3 has a number 
*after it that is not a 3, and a 3 appears in the array before any 4.
*/

public class Fix34{
  
  public int[] fix34(int[] nums) {
    for(int i = 0; i < nums.length-1; i++){
      for(int j = 1; j < nums.length; j++){
        if(nums[i]==3 && nums[i+1] != 4){         //Look for unpaired 3 
          if(nums[j] == 4 && nums[j-1] !=3){      //Look for unpaired 4
            nums[j] = nums[i+1];                  //switch numbers
            nums[i+1] =4;
          }
        }
      }
    }
    return nums;
  }
