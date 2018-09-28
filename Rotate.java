/**Auther: Wenhao Lin
 *
 *Question: Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
class Rotate {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k=k%length;         //if k == length, do not need to rotate because its a complete lab, therefore only rotate the remainder of k/length
        while(k!=0){
            int temp = nums[length-1];     //temp to store the last element 
            for(int i = length-1;i>0;i--){ //shift all to right
                nums[i]=nums[i-1];         
            }
            nums[0]=temp;                  //assignment temp to begining at index 0
            k--;
        }
    }
}