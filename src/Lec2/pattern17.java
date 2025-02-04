package Lec2;
import java.util.*;
public class pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n/2;
		int space = 1;
		while(row <= n) {
//			Star
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
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
			while(k <= star) {
				System.out.print("* ");
				k++;
			}
//			Mirror
			if(row <= n/2 ) {
				star--;
				space += 2;
			}
			else {
				star++;
				space -= 2;
			}
			System.out.println();
			row++;
		}
	}

}
