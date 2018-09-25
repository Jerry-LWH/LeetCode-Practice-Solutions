/*Author: Wenhao Lin
 *
 *Question: Determine whether an integer is a palindrome. An integer is a palindrome 
 *when it reads the same backward as forward.	Note -121 is not a palindrome because when you reverse it it becomes 121-
 */

class IsPalindrome {
    public boolean isPalindrome(int x){
        if(x < 0) return false;
        int temp = x;
        int reverse = 0;
        while(x !=0){
            reverse = reverse *10 + x%10;
            x = x/10;
        }
        return reverse == temp;
    }
}
