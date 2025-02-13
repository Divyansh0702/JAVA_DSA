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
		
		int isLower = Check(arr, n);
		if(isLower == 1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	
	public static int Check(int[][] arr, int n) {
		int i = 0;
		int j = arr[0].length-1;
		while(i < j) {
			if(arr[i][j] == 0) {
				return 1; 
			}
			i++;
			j--;
		}
		return 0;
	}

}
