/*Author; Wenhao Lin
 * Question:
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * 
 * All given inputs are in lowercase letters a-z.
 * */


public class LongestCommonPrefix {
	  public static String longestCommonPrefix(String[] strs) {
		  if(strs.length<0) {      //return "" for empty array
			  return "";
		  }else {
	        int index = 0; 
	        char letter = ' ';
	        boolean cont = true;
	        while(cont){                 //if continueable, meaning all words has next letter 
	        	boolean increase = true;  // and all prefix match up to "index" 
	            for(int i = 0; i < strs.length;i++) {
	            	if(index>strs[i].length()-1) {     //check if there is next letter in each word
	            		cont=false;
	            		increase = false;
	            		break;
	            	}
	            	if(i == 0) {               //store the letter to check in the first word
	            		letter = strs[i].charAt(index);
	            	}else if(strs[i].charAt(index) != letter) {  //check if the letter at index matches in all word
	            		cont = false;
	            		increase = false;
	            		break;
	            	}
	            }//for
	            if (increase == true) {  //increase index if all check pass in above
	            	index ++;
	            }
	        }
	        return strs[0].substring(0,index);  // index is one letter ahead but exclusive
		  }
	    }
	public static void main(String[] args) {
		int a = 2;
		String[] mystring = {"aa","s","ssc"};
		System.out.println(longestCommonPrefix(mystring));
	}
}