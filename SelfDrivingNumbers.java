/**Author: Wenhao Lin
 *A self-dividing number is a number that is divisible by every digit it contains.
 * 
 *For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 *
 *Also, a self-dividing number is not allowed to contain the digit zero.
 *
 *Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 */
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = left; i<=right; i++){
            if(checkNumber(i)){
                list.add(i);
            }
        }
        return list;
    }
      
    public static boolean checkNumber(int num){
        boolean check= true;
        int copy = num;
        while(copy != 0){
            int digit = copy % 10;
            if(digit == 0 ) return false;
            if(num % digit !=0){
                return false;
            }
            copy = copy/10;    
        }
        
        return check;
    } 
}