package Assignment_4;
import java.util.*;

public class Maz_Sum_Col {

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
		
		MaxSumCol(arr, n);
		
	}
	
	public static void MaxSumCol(int[][] arr, int n) {
		int max = Integer.MIN_VALUE;
		int col = 0;
		for (int j = 0; j < n; j++) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += arr[i][j];
				if(sum > max) {
					max = sum;
					col = j;					
				}
			}
		}
		System.out.print(col + " " + max);
		
	}

}
