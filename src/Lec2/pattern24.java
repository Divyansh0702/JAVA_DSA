package Lec2;

import java.util.Scanner;

public class pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int num = 1;
		int space = n-1;
		while(row <= n) {
			//space
			int i = 1;
			while(i <= space) {
				System.out.print(" ");
				i++;
			}
			//star
			int j = 1;
			while(j <= num) {
				System.out.print(row);
				j++;
			}
			row++;
			System.out.println();
			num += 2;
			space--;
		}
	}

}
