package Practice;

import java.util.Scanner;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i=2; i<n; i++) {
			if(n%i == 0) {
				cnt++;
				break;
			}
		}
		if(cnt>0) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
	}

}
