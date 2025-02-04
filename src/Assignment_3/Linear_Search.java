package Assignment_3;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		System.out.println(LinearSrch(arr, m));
	}
	public static int LinearSrch(int[] arr, int m) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == m) {
				return i;
			}
		}
		return -1;
	}

}
