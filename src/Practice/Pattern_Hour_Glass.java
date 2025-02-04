package Practice;

import java.util.Scanner;

public class Pattern_Hour_Glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 2*n+1;
		int space = 0;
		while(row <= 2*n+1) {
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			
			int j = 1; 
			int count = n - space;
			while(j <= star) {
				System.out.print(count + " ");
				if(j <= star/2) {
					count--;
				}
				else {
					count++;
				}
				j++;
			}
			System.out.println();			
			if(row <= n) {
				star -= 2;
				space++;
			}
			else {
				star += 2;
				space--;
			}
			row++;
			
		}
		
	}

}
