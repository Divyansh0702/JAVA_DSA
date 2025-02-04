package Assignment_3;

import java.util.Scanner;

public class Circular_Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int start = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			int NxtCircIndex = (start + i) % n;
			System.out.print(arr[NxtCircIndex] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			int PrevCircIndex = (start - i + n) % n;
			System.out.print(arr[PrevCircIndex] + " ");
		}
	}

}
