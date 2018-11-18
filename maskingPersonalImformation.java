/**Author: Wenhao Lin
 *Question: LEETCODE #831
 */

class Solution {
    public String maskPII(String S) {
        if(S.indexOf('@')!=-1){
            S=S.toLowerCase();
            String s = S.charAt(0)+"*****"+S.charAt(S.indexOf('@')-1)+S.substring(S.indexOf('@'));
            return s;
        }
        else{
            Stack<Integer> stack = new Stack<Integer>();
            for(int i = S.length()-1; i >= 0 ; i--){
                if(Character.isDigit(S.charAt(i))){
                    stack.push(Character.getNumericValue(S.charAt(i)));
                }
            }//for
            String s = "";
            if(stack.size()>10){
                s=s+"+";
                while(stack.size()>10){
                    s=s+"*";
                    stack.pop();    
                }
                s=s+"-";
            }
            s=s+"***-***-";
            while(stack.size()>4){
                stack.pop();
            }
            while(stack.size()>0){
                s=s+stack.pop();
            }
            return s;
        }
    }
}