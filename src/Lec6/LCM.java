package Lec6;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		System.out.println(ret_LCM(N1, N2));
	}
	public static int ret_LCM(int N1, int N2) {
		return (N1*N2)/GCD_HCF(N1, N2);
	}
	
	public static int GCD_HCF(int N1, int N2) {
		while(N1 % N2 != 0) {
			int rem = N1 % N2;
			N1 = N2;
			N2 = rem;
		}
		return N2;
	}
}


