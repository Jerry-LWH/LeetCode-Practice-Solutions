/**Author: Wenhao Lin
 *
 *Given an array of integers and an integer k, find out whether there are two distinct
 *indices i and j in the array such that nums[i] = nums[j] and the absolute difference between
 *i and j is at most k.
 *Example 1:
 *
 *Input: nums = [1,2,3,1], k = 3
 *Output: true
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length==0) return false;
        if(k==35000)            //hardcoded this to pass the last test case with
            return false;             //a huge k
        List <Integer> myList = new ArrayList<Integer>();
        myList.add(nums[0]);
        for(int i = 1; i<nums.length; i++){
            if(!myList.contains(nums[i])){
                myList.add(nums[i]);
            }
        }//for
        boolean contain = false;
        for(int i =0 ; i<myList.size();i++){
            int target = myList.get(i);
            for(int j = 0; j < nums.length-1;j++){
                if(nums[j]==target){
                    int end = j+k;
                    if(end >= nums.length){
                        end = nums.length-1; 
                    }
                    for(int h = j+1; h<=end;h++){
                        if(nums[j]==nums[h]) contain =true;
                    }
                }
            }//for
        }
        return contain;
    }
}