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
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		
		int[][] ans = new int[n][m];
		
		Path(maze, n, m, 0, 0, ans);
		if(val == false) {
			System.out.println("NO PATH FOUND");
		}
	}
	
	static boolean val = false;
	
	public static void Path(char[][] maze, int n, int m, int CR, int CC, int[][] ans) {
		if(CR < 0 || CC < 0 || CR >= n || CC >= m || maze[CR][CC] == 'X') {
			return;
		}
		
		if(CR == n-1 && CC == m-1) {
			ans[CR][CC] = 1;
			val = true;
			Display(ans);
		}
		
		maze[CR][CC] = 'X';
		ans[CR][CC] = 1;
		int[] r = {-1, 0, 1, 0};
		int[] c = {0, -1, 0, 1};
		for (int i = 0; i < c.length; i++) {
			Path(maze, n, m, CR + r[i], CC + c[i], ans);
		}
//		Path(maze, n, m, CR-1, CC, ans);
//		Path(maze, n, m, CR, CC-1, ans);
//		Path(maze, n, m, CR+1, CC, ans);
//		Path(maze, n, m, CR, CC+1, ans);
		maze[CR][CC] = 'O';
		ans[CR][CC] = 0;
		
	}
	
	public static void Display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
}

