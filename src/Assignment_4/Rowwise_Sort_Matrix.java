package Assignment_4;

import java.util.Scanner;

public class Rowwise_Sort_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int [n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		Sort(arr);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void Sort(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			SelectionSort(arr[i]);
		}
	}
	
	public static void SelectionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int idx = min_index(arr, i);
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
	}
	
	public static int min_index(int[] arr, int idx) {
		int min = idx;
		for(int i=idx+1; i<arr.length; i++) {
			if(arr[i] < arr[min]) {
				min = i;
			}
		}
		return min;
	}
}
