package Lec2;

import java.util.Scanner;

public class pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		int space = n-1;
		while(row <= n) {
			int j = 1;
			while(j <= space) {
				System.out.print("  ");
				j++;
			}
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			row++;
			star--;
			space--;
		}
		row = 1;
		star = 2;
		space = 1;
		while(row <= n-1) {
			int j = 1;
			while(j <= space) {
				System.out.print("  ");
				j++;
			}
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			row++;
			star++;
			space++;
		}
	}	

}
