package Lec2;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n-1;
		while(row <= 2*n-1) {
//			Space
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
//			Star
			int j = 1;
			while(j <= star) {
				System.out.print("* ");
				j++;
			}
//			Mirror
			if(row < n) {
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
			
			System.out.println();
			row++;
			
		}
	}

}
