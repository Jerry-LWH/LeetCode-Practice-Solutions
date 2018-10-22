/**Author:Wenhao Lin
 *Given an array consisting of n integers, find the contiguous subarray
 *of given length k that has the maximum average value. And you need to
 *output the maximum average value.
 *
 *Example 1:
 *Input: [1,12,-5,-6,50,3], k = 4
 *Output: 12.75
 *Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 */


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double tempAve=0;
        double finalAve=0;
        int front = 0;
        int rear= k-1;
        double sum = 0.0;
        for(int i = 0; i <= rear ; i++){
            sum += nums[i];
        }
        tempAve=sum/k;
        finalAve=tempAve;
        front++;
        rear++;
        while(rear < nums.length){
            sum=sum-nums[front-1];
            sum = sum+nums[rear];
            tempAve=sum/k;
            if(tempAve>finalAve) finalAve=tempAve;
            front++;
            rear++;
        }//while
        return finalAve;
    }
}

//The idea here is to get the very first subarray and calculate the //average. then delete the first element and add on the next element in //rear as long as rear is less then the orginal array length. In each //iteration recalculate the sum and average, if it is greater than the //finalAverae, then update the final average. 
//return final average at the end.
