package example;

/**Auther:Wenhao Lin
 * Question: Given a String, print out the number of the first letter of each word in string if it is more than 1;
 * Example: Given s="My mom has made my a colorful cake", the result should print out "m=4,c=2", should not print a and h because
 * they have only 1
 */
import java.util.Arrays;
public class Solution {
	public static void exist(String s) {
		String[] myArray = s.split(" ");       //split strings into words separated by white spaces into string array
		char[] mychar= new char[myArray.length]; //char array to store the first letter of all words
		int n = myArray.length;
	
		for(int i = 0; i < n; i++) {
			mychar[i]=Character.toLowerCase(myArray[i].charAt(0));  //convert the first letter to lower case and store it to the char array
		}
	
		Arrays.sort(mychar); //sort the array so Identical letters are next to each other
		int num = 1;    //used to track the number of identical letters,start at 1 because a letter appeared at least 1 time
		String myString="";  
		for(int i =0	;i<n-1;i++) {  //iterate though array until n-1 index 
			if(mychar[i]==mychar[i+1]) {  //if index i= i+1, num++; note:num start at 1
				num++;               
			}
			//if index i!= i+1 or array has reach to end(n-2), check if num>1 (meaning more than 1 instance of the same char)
			//note: must use if NOT else if because if index i=i+1, else if will skip than case
			if(mychar[i] != mychar[i+1] || i==n-2) { 
				if(num>1) {                  //if more than 1 instance of same letter
					myString=myString+mychar[i]+"="+num+", ";    //concatenate to myString
					num=1;                                  //reset num =1;  
				}
			}
		}//for
	
			//print out final result
		System.out.println(myString);	
	}	
}
