package Lec6;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int Aayush = sc.nextInt();
			int Harshit = sc.nextInt();
			ShoppingGame(Aayush, Harshit);
		}
	}
	public static void ShoppingGame(int Aayush, int Harshit) {
		int i = 1;
		while(i <= Math.max(Aayush, Harshit)) {
			if(i > Aayush) {
				System.out.println("Harshit");
				break;
			}
			if(i > Harshit) {
				System.out.println("Aayush");
				break;
			}
			i++;
		}
	}
}

