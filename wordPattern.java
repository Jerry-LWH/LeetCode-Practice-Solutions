/**Author: Wenhao Lin
 *Question: Given a pattern and a string str, find if str follows the same pattern.
 *
 *Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str
 */

class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern.equals("") && !str.equals("")) return false;
        String[] myStr = str.split(" ");
        String[] myPattern = pattern.split("");
        System.out.println(myStr.length);
        System.out.println(myPattern.length);
        if(myStr.length!=myPattern.length) return false;
        List<String> myStr1 = new ArrayList<String>();
        List<String> myPattern1 = new ArrayList<String>();
        for(int i = 0; i <myStr.length;i++){
            myStr1.add(myStr[i]);
            myPattern1.add(myPattern[i]);
        }
        
        String word = "";
        String letter = "";
        while(myStr1.size()!=0){
            letter= myStr1.get(0);
            word = myPattern1.get(0);
            myStr1.remove(0);
            myPattern1.remove(0);
            while(myStr1.contains(letter)){
                if(myPattern1.contains(word)==false) return false;
                if(myStr1.indexOf(letter)!=myPattern1.indexOf(word)) return false;
                myStr1.remove(letter);
                myPattern1.remove(word);
            }
            if(myPattern1.contains(word)) return false;
        }
        
        if(myPattern1.size()!=0)return false;
        else return true;
        
    }
}