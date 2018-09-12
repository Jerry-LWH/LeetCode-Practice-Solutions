/*Author:Wenhao Lin
 *
 *Question:
 *For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. 
 *The number twenty seven is written as XXVII, which is XX + V + II. Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it
 * making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 *I can be placed before V (5) and X (10) to make 4 and 9. 
 *X can be placed before L (50) and C (100) to make 40 and 90. 
 *C can be placed before D (500) and M (1000) to make 400 and 900.
 *Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 */ 
	

public class RomanToInt {

    public static int romanToInt(String s) {
        int answer = 0;
        int length = s.length();
        for(int i = 0; i < s.length();i++) {
        	switch(s.charAt(i)) {
        	case 'M': 
        		answer +=1000;
        		break;
        	case'D':
        		answer +=500;
        		break;
        	case'C':
        		if(i+1 != length && s.charAt(i+1)=='D') {
        			answer +=400;
        			i++;
        		}else if(i+1 != length && s.charAt(i+1)=='M') {
        			answer +=900;
        			i++;
        		}else {
        			answer +=100;
        		}
        		break;
        	case'L':
        		answer +=50;
        		break;
        	case'X':
        		if(i+1 != length && s.charAt(i+1)=='L') {
        			answer += 40;
        			i++;
        		}else if (i+1 != length && s.charAt(i+1)=='C') {
        			answer +=90;
        			i++;
        		}else {
        			answer +=10;
        		}
        		break;
        	case'V':
        		answer +=5;
        		break;
        	case'I':
        		if(i+1 != length && s.charAt(i+1)=='V') {
        			answer += 4;
        			i++;
        		}else if(i+1 != length && s.charAt(i+1)=='X') {
        			answer +=9;
        			i++;
        		}else {
        			answer +=1;
        		}
        		break;
        	default:
        		return 0;
        	}
        }
        return answer;
    }
}
