package Lec19;

import java.util.Scanner;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		char[][] board = new char[n][m];
		
		for (int i = 0; i < board.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				board[i][j] = s.charAt(j);
			}
		}
		
		String word = sc.next();
		
		isExist(board, word, 0, 0);
	}
	static boolean val = false;
	
	public static void isExist(char[][] board, String word, int cr, int cc) {
		if(cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || board[cr][cc] == 'X') {
			return;			
		}
		
		for (int i = 0; i < word.length(); i++) {
			if(board[cr][cc] == word.charAt(i)) {
				val = true;
			}
			return;
		}
		
		if(word.length() == 0) {
			System.out.println("true");
		}
		
		if(val) {
			board[cr][cc] = 'X';
			int[] r = {-1, 0, 1, 0};
			int[] c = {0, -1, 0, 1};
			
			for(int i = 0; i < c.length; i++) {
				isExist(board, word.substring(i+1), cr + r[i], cc + r[i]);
			}
			board[cr][cc] = 'X';
			
//			isExist(board, word, cr-1, cc);
//			isExist(board, word, cr, cc-1);
//			isExist(board, word, cr+1, cc);
//			isExist(board, word, cr-1, cc+1);
		}
		
	}

}
