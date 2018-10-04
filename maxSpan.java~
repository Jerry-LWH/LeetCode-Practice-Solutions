/*Consider the leftmost and righmost appearances of some value in an array.
 * We'll say that the "span" is the number of elements between the two inclusive. 
 *A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)

 *maxSpan([1, 2, 1, 1, 3]) ? 4
 *maxSpan([1, 4, 2, 1, 4, 1, 4]) ? 6
 *maxSpan([1, 4, 2, 1, 4, 4, 4]) ? 6
 */

public int maxSpan(int[] nums) {
    int span = 1;
    if(nums.length < 2){
      return nums.length;
    }else{
      for(int i = 0; i < nums.length-1; i++){
        for(int j = 1; j < nums.length; j++){
          if(nums[i] == nums[j] && j-i+1 > span){
            span= j-i+1;
          } 
        }
      }
      return span;
    }
}