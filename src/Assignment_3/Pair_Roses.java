package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_Roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int[] price = new int[n];
			for (int i = 0; i < price.length; i++) {
				price[i] = sc.nextInt();
			}
			int money = sc.nextInt();
			Arrays.sort(price);		
			PairRose(price, money);
		}		
	}
	public static void PairRose(int[] price, int money) {
		int i = 0;
		int j = price.length-1;
		int price1 = 0, price2 = 0;
		while(i < j) {
			int sum = price[i] + price[j];
			if(sum == money) {
				price1 = price[i];
				price2 = price[j];
				i++;
				j--;
			}
			else if(sum > money) {
				j--;
			}
			else {
				i++;
			}
		}
		System.out.println("Deepak should buy roses whose prices are "+price1+" and "+price2+".");
	}
	

}
