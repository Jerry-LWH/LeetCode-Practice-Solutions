/*Auther: Wenhao Lin
 *
 *Question:Given a sorted array nums, remove the duplicates in-place such that each 
 *element appear only once and return the new length. Do not allocate extra space for 
 *another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicates {

	 static int removeDuplicates(int nums[]){
		 int n = nums.length;
		 if (n == 0 || n == 1) {
	            return n;
		 }
	     // To store index of next unique element
	     int j = 0;
	      
	     // update the array with unique numbers with corresponding index
	     for (int i = 0; i < n-1; i++) {
	    	 if (nums[i] != nums[i+1]) {
	    		 nums[j] = nums[i]; // update array at index j with unique element at index i
	    		 j++;               //increment j  
	          }
	     }//for

	     //to add the last number because if last two numbers equals, none would be
	     //updated in above loop. If last two number not equal, then only the first number
	     //is updated in index j. either case we need to manually update the last number.
	     nums[j]= nums[n-1];
	     j++; //adding 1 to index to make it the length to return;
	     return j;
	    }	 

}
