package Practice;
import java.util.*;

public class Rat_Chases_It_Cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				maze[i][j] = sc.next().charAt(0);
			}
		}
		
		Path(maze, n, m, 0, 0);
	}
	
	public static void Path(char[][] maze, int n, int m, int CR, int CC) {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if(maze[i][j] == 'X') {
					
				}
			}
		}
	}
}
