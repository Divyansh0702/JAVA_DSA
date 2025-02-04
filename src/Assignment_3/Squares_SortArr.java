package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Squares_SortArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int res[] = Squares(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
	public static int[] Squares(int[] arr) {
		int sqr[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			sqr[i] = arr[i]*arr[i];
		}
		Arrays.sort(sqr);
		return sqr;
	}

}
