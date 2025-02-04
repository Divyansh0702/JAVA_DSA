package Assignment_3;

import java.util.Scanner;

public class Inverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] inverse = InvArr(arr,n);
		for (int i = 0; i < inverse.length; i++) {
			System.out.print(inverse[i] + " ");
		}
		
	}
	public static int[] InvArr(int[] arr, int n) {
		int[] Inv = new int[n];
		for (int i = 0; i < arr.length; i++) {
			Inv[arr[i]] = i;
		}
		return Inv;
	}

}
