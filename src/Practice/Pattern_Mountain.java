package Practice;

import java.util.Scanner;

public class Pattern_Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = 2*n-3;
		while(row <= n) {
//			Star
			int i = 1;
			int val = 1;
			if(row == n) {
				i = 2;
			}
			while(i <= star) {
				System.out.print(val+"\t");
				i++;
				val++;
			}
//			Space
			int j = 1;
			while(j <= space) {
				System.out.print("\t");
				j++;
			}
//			Star
			int k = 1;
			val = row;
			while(k <= star) {
				System.out.print(val+"\t");
				val--;
				k++;
			}
			System.out.println();
			row++;
			star++;
			space -= 2;
		}
	}
}
