package Lec16;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 3;
		String ans = "";
		
		PathFinder(m, n, 0, 0, ans);
	}
	
	public static void PathFinder(int m, int n, int CR, int CC, String ans) {
		if(CR > m-1 || CC > n-1) {
			return;
		}
		 
		if(CR == m-1 && CC == n-1) {
			System.out.println(ans);
		}
		
		PathFinder(m, n, CR, CC + 1, ans + "H");
		PathFinder(m, n, CR + 1, CC, ans + "V");
	}
}
