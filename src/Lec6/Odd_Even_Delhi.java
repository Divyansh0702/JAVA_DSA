package Lec6;

import java.util.Scanner;

public class Odd_Even_Delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
			int carnum = sc.nextInt();
			if(odd_even(carnum) == 1) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");			
			}
			t--;
		}	
		
	}
	public static int odd_even(int carnum) {
		int sumOdd = 0;
		int sumEven = 0;
		while(carnum > 0) {
			int rem = carnum % 10;
			if(rem%2 == 0) {
				sumEven += rem;
			}
			else {
				sumOdd += rem;
			}
			carnum /= 10;
		}
		if(sumEven%4 == 0 || sumOdd%3 == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
