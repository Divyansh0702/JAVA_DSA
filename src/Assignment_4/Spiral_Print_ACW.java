package Assignment_4;

import java.util.Scanner;

public class Spiral_Print_ACW {

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
		
		SpiralPrint(arr, n, m);
	}
	
	public static void SpiralPrint(int[][] arr, int n, int m) {
		int minr = 0, maxr = n-1, minc = 0, maxc = m-1;
		int total_Elem = n*m;
		int cnt = 0;
		while(cnt < total_Elem) {
			for (int i = minr; i <= maxr && cnt < total_Elem; i++) {
				System.out.print(arr[i][minc] + ", ");
				cnt++;
			}
			minc++;
			
			
			for (int i = minc; i <= maxc && cnt < total_Elem; i++) {
				System.out.print(arr[maxr][i] + ", ");
				cnt++;
			}
			maxr--;
			
			for (int i = maxr; i >= minr && cnt < total_Elem; i--) {
				System.out.print(arr[i][maxc] + ", ");
				cnt++;
			}
			maxc--;

			for (int i = maxc; i >= minc && cnt < total_Elem; i--) {
				System.out.print(arr[minr][i] + ", ");
				cnt++;
			}
			minr++;
		}
		System.out.print("END");
	}

}
