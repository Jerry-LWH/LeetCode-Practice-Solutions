/**Author Wenhao Lin
 *Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 *An input string is valid if:
 *
 *Open brackets must be closed by the same type of brackets.
 *Open brackets must be closed in the correct order.
 *Note that an empty string is also considered valid.
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<Character>();
        boolean answer = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='(') myStack.push('(');
            if(s.charAt(i)=='{') myStack.push('{');
            if(s.charAt(i)=='[') myStack.push('[');
            else{
                if(myStack.empty()){
                    answer = false;
                    break;
                }else if (s.charAt(i)==')'){
                    if(myStack.peek()=='('){
                        myStack.pop();
                    }else{
                        answer = false;
                        break;
                    }
                }else if (s.charAt(i)=='}'){
                    if(myStack.peek()=='{'){
                        myStack.pop();
                    }else{
                        answer =false;
                        break;
                    }
                }else if (s.charAt(i)==']'){
                    if(myStack.peek() == '['){
                        myStack.pop();
                    }else {
                        answer = false;
                        break;
                    }
                }   
            }
        }
        if(myStack.empty()==false)return false;
        else return answer;
    }
}