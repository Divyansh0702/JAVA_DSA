package Lec5;

import java.util.Scanner;

public class Farh_To_Cel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int step = sc.nextInt();
		for(int i = min; i <= max; i += step) {
			int c = (int)((5.0/9)*(i-32));
			System.out.println(i + "\t" + c);
		}
	}	

}
	