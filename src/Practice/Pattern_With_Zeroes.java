package Practice;

import java.util.Scanner;

public class Pattern_With_Zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		while(row <= n) {
			int i = 1;
			while(i <= star) {
				if(i == 1 || i == row) {
					System.out.print(row + "\t");										
				}
				else {
					System.out.print("0" + "\t");
				}
				i++;
			}
			System.out.println();
			row++;
			star++;
		}
	}

}
