package Practice;

import java.util.Scanner;

public class Count_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digit = sc.nextInt();
		int cnt = 0;
		while(n > 0) {
			int rem = n % 10;
			if(rem == digit) {
				cnt++;
			}
			n = n/10;
		}
		System.out.println(cnt);
	}

}
