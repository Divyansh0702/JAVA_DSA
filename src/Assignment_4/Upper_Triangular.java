package Assignment_4;

import java.util.Scanner;

public class Upper_Triangular {

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
		
		Print(arr);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				 System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void Print(int[][] arr) {
		int i = arr.length-1;
		int j = 0;
		while(true) {
			if(i > j) {
				arr[i][j] = 0;
			}
			i--;
			j++;
		}
	}

}
