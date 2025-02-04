package Lec6;

import java.util.Scanner;

public class Simple_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int csum = 0;
		while(true) {
			int n = sc.nextInt();
			csum += n;
			if(csum < 0) {
				break;
			}
			System.out.println(n);
		}
	}


}
