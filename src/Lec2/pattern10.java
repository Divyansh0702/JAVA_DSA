package Lec2;

import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n + (n-1);
		int space = 0;
		while(row <= n) {
			//space
			int i = 1;
			while(i <= space) {
				System.out.print(" ");
				i++;
			}
			//star
			int j = 1;
			while(j <= star) {
				System.out.print("*");
				j++;
			}
			row++;
			System.out.println();
			star -= 2;
			space++;
		}
	}

}
