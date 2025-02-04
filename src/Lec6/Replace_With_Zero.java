package Lec6;

import java.util.Scanner;

public class Replace_With_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(Replace(n));
	}
	public static long Replace(long n) {
		long sum = 0;
		long mul = 1;
		if(n == 0) {
			return 5;
		}
		while(n > 0) {
			long rem = n % 10;
			if(rem == 0) {
				rem = 5;
			}
			sum += rem*mul;
			n /= 10;
			mul *= 10;
		}
		return sum;
	}
}
