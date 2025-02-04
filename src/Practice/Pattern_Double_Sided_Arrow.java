package Practice;

import java.util.Scanner;

public class Pattern_Double_Sided_Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space1 = n-1;
		int space2 = -1;
		while(row <= n) {
			int i = 1;
			while(i <= space1) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int count = row;
			if(row > n/2 + 1) {
				count = n - row + 1;
			}
			
			while(j <= star) {
				System.out.print(count + " ");
				count--;
				j++;
			}
			
			int k = 1;
			while(k <= space2) {
				System.out.print("  ");
				k++;
			}
			
			int l = 1;
			if(row == 1 || row == n) {
				l = 2;
			}
			count = 1;
			while(l <= star) { 
				System.out.print(count + " ");
				count++;
				l++;
			}
			System.out.println();
			if(row < n/2+1) {
				star++;
				space1 -= 2;
				space2 += 2;
			}
			else {
				star--;
				space1 += 2;
				space2 -= 2;
			}
			row++;
			
		}
	}
	

}
