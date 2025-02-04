package Assignment_3;

import java.util.Scanner;

public class Run_Sum_Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] resArr = RunSum(arr);
		for (int i = 0; i < resArr.length; i++) {
			System.out.print(resArr[i] + " ");
		}
	}
	public static int[] RunSum(int[] arr) {
		int sum = 0;
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			newArr[i] = sum;
		}
		return newArr;
	}
}
