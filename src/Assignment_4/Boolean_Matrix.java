package Assignment_4;

import java.util.Scanner;

public class Boolean_Matrix {

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
		
		Print(arr, n, m);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void Print(int[][] arr, int n, int m) {
		boolean[] row = new boolean[n];
		boolean[] col = new boolean[m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(arr[i][j] == 1) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(row[i] || col[j]) {
					arr[i][j] = 1;
				}
			}
		}
		
	}

}
