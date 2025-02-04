package Practice;

import java.util.Scanner;

public class Odd_Even_Place_Sum_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pos = 1;
		int sumOdd = 0;
		int sumEven = 0;
		while(n > 0) {
			int rem = n % 10;
			if(pos%2 != 0) {
				sumOdd += rem;
			}
			else {
				sumEven += rem;
			}
			pos++;
			n = n/10;
		}
		System.out.println(sumOdd);
		System.out.println(sumEven);
	}

}
