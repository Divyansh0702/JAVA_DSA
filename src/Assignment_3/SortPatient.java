package Assignment_3;

import java.util.Scanner;

public class SortPatient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		counter(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void counter(int[] arr) {
		int cntZero = 0, cntOne = 0, cntTwo = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				cntZero++;
			}
			else if(arr[i] == 1) {
				cntOne++;
			}
			else {
				cntTwo++;
			}
		}
		
		int index = 0;
		for (int i = 0; i < cntZero; i++) {
			arr[index++] = 0;
		}
		
		for (int i = 0; i < cntOne; i++) {
			arr[index++] = 1;
		}
		
		for (int i = 0; i < cntTwo; i++) {
			arr[index++] = 2;
		}
	}
	
}
