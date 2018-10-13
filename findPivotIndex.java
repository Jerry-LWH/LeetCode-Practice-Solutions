/**Auther: Wenhao Lin
*
 *Given an array of integers nums, write a method that returns the "pivot" index of this array.
* 
*We define the pivot index as the index where the sum of the numbers to the left of the    *index is equal to the sum of the numbers to the right of the index.
* 
*If no such index exists, we should return -1. If there are multiple pivot indexes, you should   *return the left-most pivot index.
*
*Example 1:
*Input: nums = [1, 7, 3, 6, 5, 6]
*Output: 3
*Explanation: The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum *of numbers *to the right of index 3. Also, 3 is the first index where this occurs.
*/

class Solution{
    public int pivotIndex(int[] nums) {
        int pivot = -1;
        int sum=0;            //total sum of the array
        for(int i : nums){
            sum += i;
        }
        
        int tempSum=0;        //sum of left size elements of array
        for(int i = 0; i< nums.length;i++){
            if(tempSum==sum-nums[i]-tempSum){    //idea is left+pivot+right = sum, therefore if we find the pivot if 
                pivot =i;
                break;
            }
            tempSum += nums[i];
        }//for
        
       
        return pivot;
    }
}