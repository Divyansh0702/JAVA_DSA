package Assignment_4;

import java.util.Scanner;

public class Lower_Triangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
				
		int[][] arr = new int [n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		boolean isLower = Check(arr, n);
		System.out.println(isLower);
	}
	
	public static boolean Check(int[][] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if(arr[i][j] != 0) {
					return false;
				}
			}
		} 
		return true;
	}

}
