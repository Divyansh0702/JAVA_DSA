package Lec6;

import java.util.Scanner;

public class Print_All_Armstrong_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		for(int i = N1; i<=N2; i++) {
			int res = is_armstrong(i);
			if(res == i) {
				System.out.println(i);
			}
		}
	}	
	public static int countDigits(int n) {
		int cnt = 0;
		while(n > 0) {
			n = n/10;
			cnt++;
		}
		return cnt;
	}
	public static int is_armstrong(int n) {
		int sum = 0;
		int p = countDigits(n);
		while(n > 0) {
			int rem = n%10;
			sum += Math.pow(rem, p);
			n /= 10;
		}
		return sum;
	}
}
