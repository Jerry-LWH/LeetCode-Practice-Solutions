/**Author Wenhao Lin
 *Given an array nums, write a function to move all 0's to the end of it
 *while maintaining the relative order of the non-zero elements.
 *without creating a copy of the array
 *Example:
 *
 *Input: [0,1,0,3,12]
 *Output: [1,3,12,0,0]
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int currentPos = 0;
        
        for(int i= 0; i < nums.length; i ++){
            if(nums[i]!=0){
                nums[currentPos]=nums[i];
                if(i!=currentPos){             //think of this case[1,1,1], we would not need to modify nums[i] to zero, but [0,1] we would! because 
                    nums[i] = 0;               //becasue currentPos = 0, i = 1; we store 1 in nums[currentPos] but need to set nums[i]=0;
                }
                currentPos ++;
            }
        }//for
        for(int i = currentPos; i <nums.length; i++){
            nums[currentPos]=0;
        }
    }
}

//note:move all numbers that not zero to the front of the array,
//and fill the array with zeros if currentPos is not equal to the length of array