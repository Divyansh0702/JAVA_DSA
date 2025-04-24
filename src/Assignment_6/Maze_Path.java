package Assignment_6;

import java.util.Scanner;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] maze = new int[n][m];
		
		Path(m, n, 0, 0, "");
		System.out.println();
		System.out.println(CountPath(m, n, 0, 0, ""));
	}
	
	public static void Path(int m, int n, int CR, int CC, String ans) {
		if(CR > n-1 || CC > m-1) {
			return;
		}
		if(CR == n-1 && CC == m-1) {
			System.out.print(ans + " ");
			return;
		}
		Path(m, n, CR + 1, CC, ans + "V");
		Path(m, n, CR, CC + 1, ans + "H");
		Path(m, n, CR + 1, CC + 1, ans + "D");
	}
	
	public static int CountPath(int m, int n, int CR, int CC, String ans) {
		if(CR > n-1 || CC > m-1) {
			return 0;
		}
		if(CR == n-1 && CC == m-1) {
			return 1;
		}
		int a1 = CountPath(m, n, CR, CC + 1, ans + "H");
		int a2 = CountPath(m, n, CR + 1, CC, ans + "V");
		int a3 = CountPath(m, n, CR + 1, CC + 1, ans + "D");
		return a1 + a2 + a3;
	}

}
