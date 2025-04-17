package Practice;

import java.util.Scanner;

public class addition_2Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int arr1[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		int arr2[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		int result[][] = add(arr1, arr2, n, m);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}	
	}
	
	public static int[][] add(int[][] arr1, int arr2[][], int n, int m){
		int[][] sumArr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sumArr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		return sumArr;
	}

}












