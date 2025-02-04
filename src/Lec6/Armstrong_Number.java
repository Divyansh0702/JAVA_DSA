package Lec6;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(is_Armstrong(n));
		
	}
	public static int countDigits(int n) {
		int cnt = 0;
		while(n > 0) {
			n = n / 10;
			cnt++;
		}
		return cnt;
	}
	
	public static boolean is_Armstrong(int n) {
		int dup = n;
		int sum = 0;
		int p = countDigits(n);
		while(n > 0) {
			int rem = n % 10;
			sum += Math.pow(rem, p);
			n = n/10;
		}
		if(sum == dup) {
			return true;
		}
		else {
			return false;
		}
	}
}
