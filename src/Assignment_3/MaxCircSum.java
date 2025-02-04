package Assignment_3;

import java.util.Scanner;

public class MaxCircSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(Max_Circ_Sum(arr));
		}
	}
	public static int Max_Circ_Sum(int[] arr) {
		int start = arr.length-1;
		int sum = 0;
		for (int i = 0; i < arr.length-1; i++) {
			int circIdx = (start + i) % arr.length;
			sum += arr[circIdx];
		}
		return sum;
	}

}
