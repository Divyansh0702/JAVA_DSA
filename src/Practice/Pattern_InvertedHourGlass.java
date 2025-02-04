package Practice;

import java.util.Scanner;

public class Pattern_InvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = 2*n - 1;
		while(row <= 2*n + 1) {
//			Star
			int i = 1;
			int val = n;
			while(i <= star) {
				System.out.print(val+" ");
				val--;
				i++;
			}
//			Space
			int j = 1;
			while(j <= space) {
				System.out.print("  ");
				j++;
			}
//			Star
			int k = 1;
			if(row == n + 1) {
				k = 2;
			}
			val = n - star + 1;
			while(k <= star) {
				if(val == 0) {
					val = 1;
				}
				System.out.print(val+" ");
				val++;	
				k++;
			}
			System.out.println();	
			if(row <= n) {
				star++;
				space -= 2;
			}
			else {
				star--;
				space += 2;
			}
			row++;
		}
	}

}
