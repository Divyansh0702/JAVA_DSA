package Assignment_4;

import java.util.Scanner;

public class Matrix_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	
		int target = sc.nextInt();
		System.out.println(Search(arr, n, m, target));
	
	}
	
	public static int Search(int[][] arr, int n, int m, int target) {
		int i = 0;
		int j = m-1;
		while(i < n && j >= 0) {
			if(arr[i][j] == target) {
				return 1;
			}
			else if(arr[i][j] < target) {
				i++;
			}
			else {
				j--;
			}
		}
		return 0;
	}
}
