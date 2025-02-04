package Lec4;

import java.util.Scanner;

public class Reverse_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		while(n > 0) {
			int ldig = n % 10;
			rev = rev*10 + ldig;
			n = n / 10;
		}
		System.out.println(rev);
	}

}
