package Assignment_3;

import java.util.Scanner;

public class Sort_ZeroesOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		counter(arr);
		
	}
	public static void counter(int[] arr) {
		int cntZero = 0;
		for (int i = 0; i < arr.length; i++) {
			if( arr[i] == 0 ) {
				cntZero++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(i < cntZero) {
				System.out.print("0" + " ");
			}
			else {
				System.out.print("1" + " ");
			}
		}
	}
}






