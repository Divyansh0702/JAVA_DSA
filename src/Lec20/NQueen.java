package Lec20;

public class NQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean board[][] = new boolean[n][n];
		
		Queen(board, n, 0);

	}
	
	public static void Queen(boolean board[][], int tq, int row) {
		if(tq == 0) {
			Display(board);
			System.out.println();
			return;
		}
		
		for (int col = 0; col < board[0].length; col++) {
			if(isitSafe(board, row, col) == true) {
				board[row][col] = true;
				Queen(board, tq-1, row+1);
				board[row][col] = false;			
			}
		}
		
	}
	
	public static boolean isitSafe(boolean board[][], int row, int col) {
		//Above
		int r = row;
		while(r >= 0) {
			if(board[r][col] == true) {
				return false;
			}
			r--;
		}
		
		//left diagonal
		r = row;
		int c = col;
		while(r >= 0 && c >= 0) {
			if(board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}
		
		//right diagonal
		r = row;
		c = col;
		while(r >= 0 && c < board[0].length) {
			if(board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
	
	public static void Display(boolean board[][]) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}











