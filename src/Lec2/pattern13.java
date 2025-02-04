package Lec2;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		while(row <= 2*n-1) {
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			if(row < n) {
				star++;
			}
			else {
				star--;
			}
			System.out.println();
			row++;
			
		}
//		row = n-1;
//		while(row >= 1) {
//			int star2 = 1;
//			while(star2 <= row) {
//				System.out.print("*");
//				star2++;
//			}
//			System.out.println(" ");
//			row--;
//		}
		
	}

}
