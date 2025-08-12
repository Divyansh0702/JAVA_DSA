package Lec4;

import java.util.*;

public class Sum_OF_Digits_In_Base_K {

	public static int sumBase(int n, int k) {
		int sum = 0;
		while (n > 0) {
			sum += n % k; // get the last digit in base k
			n /= k;       // remove last digit
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int result = sumBase(n, k);
		System.out.println(result);
	}

}
