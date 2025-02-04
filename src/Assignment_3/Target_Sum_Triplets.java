package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Target_Sum_Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		Arrays.sort(arr);
		Triplet(arr, t);
	}
	
	public static void Triplet(int[] arr, int t) {
		for(int i=0; i<arr.length-2; i++){
			int j = i + 1;
			int k = arr.length-1;
			while(j<k) {
				int sum = arr[i] + arr[j] + arr[k];
				if(sum == t) {
					System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
					j++;
					k--;
				}
				else if(sum > t) {
					k--;
				}
				else {
					j++;
				}
			}
		}
	}
}
