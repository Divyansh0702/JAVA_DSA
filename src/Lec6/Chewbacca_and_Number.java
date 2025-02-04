package Lec6;

import java.util.Scanner;

public class Chewbacca_and_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(ChewbaccaNum(n));
		
	}
	public static long ChewbaccaNum(long n) {
		long sum = 0;
		long mul = 1;
		while(n > 0) {
			long rem = n % 10;
			if(rem >= 5 && n != 9) {
				sum += (9 - rem) * mul;
			}
			else {
				sum += rem * mul;
			}
			n /= 10;
			mul *= 10;
		}
		return sum;
	}
}
