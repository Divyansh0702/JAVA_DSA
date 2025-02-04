package Practice;

import java.util.Scanner;

public class R4_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		while(row <= n) {
			int i = 1;
			while(i <= star) {
				System.out.print("*");
				i++;
			}
			System.out.println();
			System.out.println();
			row++;
			star++;
		}
	}

}
