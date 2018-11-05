/**Author: Wenhao Lin
 *
 *Given a non-empty array of integers, return the third maximum number 
 *in this array. If it does not   exist, return the maximum number. 
 *The time complexity must be in O(n).
 */

class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length==0){
            return 0;
        }else{
            Arrays.sort(nums);                              //sort array
            List<Integer> myList = new ArrayList<Integer>();
            myList.add(nums[0]);                            //add first element
            for(int i = 1; i<nums.length;i++){
                if(nums[i]!=nums[i-1]) myList.add(nums[i]);  //add unique elements
            } 
            if(myList.size()<3){                          //ex[1,2]
                return myList.get(myList.size()-1);       //return 2, second largest 
            }
            else{                                      //[1,2,3,4,5,6,7]  
              return myList.get(myList.size()-3);      //if size>3 return third from last 
            }
        }   
    }
}