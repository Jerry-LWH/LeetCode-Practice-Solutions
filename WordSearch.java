/* Question:
 * Given a 2D board and a word, find if the word exists in the grid.
 */	
import java.util.ArrayList;

class WordSearch {

public static boolean exist(char[][] board, String word) {
		ArrayList<Character> myList = new ArrayList<Character>();
		for(int i = 0; i < board.length;i++){
			for(int j = 0; j < board[i].length;j++){
				myList.add(board[i][j]);  
	            	}
	        }
		
		for(int i = 0;i<word.length();i++) {
			int temp = -1;
			if((temp = myList.indexOf(word.charAt(i)))!=-1) {
				myList.remove(temp);
			}else {
				return false;
			}
		}
		return true;
	}
    
}