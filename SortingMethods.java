public class SortingMethods {
	//**BubbleSort**//
	/* Time ComplexityO(n^2)
	 * The algorithm works by comparing each item in the list with the item next to it,
	 * and swapping them if required. In other words, the largest element has 
	 * bubbled to the top of the array. The algorithm repeats this process until it
	 *  makes a pass all the way through the list without swapping any items.
	 */
	public static int[] bubbleSort(int[] nums) {
		for(int i = nums.length -1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
				}
			}
		}//for
		return nums;
	}//bubbleSort

	//**SelectionSort**//
	/*Time Complexity(N^2)
	 * 
	 * you look through the entire array for the smallest element, once you find it you swap it (the smallest element) 
	 * with the first element of the array. Then you look for the smallest element in the remaining array
	 * (an array without the first element) and swap it with the second element. Then you look for the
	 * smallest element in the remaining array (an array without first and second elements) and swap it
	 * with the third element, and so on. 
	 **/
	public static int[] selectionSort(int[] nums) {
		for(int i = 0; i < nums.length-1; i++) {
			int minIndex=i;
			for(int j = i+1; j< nums.length; j++) {
				if(nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			int temp = nums[i];
			nums[i]=nums[minIndex];
			nums[minIndex]=temp;
		}
		return nums;
	}

    //loop through the array and keep index 0 to index i sorted;
    //j = i, and loop backand keep swapping if nums[j]< nums[j-1];
    //j is decrementing 
    public static void insertionSort(int[] nums){
	for(int i = 0; i < nums.length; i ++){
	    for(int j = i; j>0; j--){
		if(nums[j]< nums[j-1]){
		    int temp = nums[j];
		    nums[j]= nums[j-1];
		    nums[j-1]=temp;
		}
	    }
	}
    }//insertionSort
}

