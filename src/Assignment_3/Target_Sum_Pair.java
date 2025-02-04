package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Target_Sum_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		Arrays.sort(arr);
//		Sum(arr, m);	
		SumPair(arr, m);	
	}
//	Two Pointer Approach
	public static void SumPair(int[] arr, int m) {
		int i = 0;
		int j = arr.length-1;
		while(i < j) {
			int sum = arr[i] + arr[j];
			if(sum == m) {
				System.out.println(arr[i] + " and " + arr[j]);
				i++;
				j--;
			}
			else if(sum > m) {
				j--;
			}
			else {
				i++;
			}
		}
	}
	
//	BruteForce Approach
	public static void Sum(int[] arr, int m) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				sum = arr[i] + arr[j];
				if(sum == m) {
					System.out.println(arr[i] + " and " + arr[j]);
				}
			}
		}
	}

}
