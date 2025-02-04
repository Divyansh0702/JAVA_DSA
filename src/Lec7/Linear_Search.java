package Lec7;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int item = sc.nextInt();
		int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
		
		System.out.println(Search(arr, item));
		
	}
	public static int Search(int[] arr, int item) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == item) {
				return i;
			}
		}
		return -1;
	}
	
}