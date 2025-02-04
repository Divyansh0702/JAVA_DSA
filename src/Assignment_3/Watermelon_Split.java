package Assignment_3;

import java.util.Scanner;

public class Watermelon_Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		checkSplit(n);
		
	}
	public static void checkSplit(int n) {
		if(n!=2 && n % 2 == 0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
