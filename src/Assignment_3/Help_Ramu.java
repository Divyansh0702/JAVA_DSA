package Assignment_3;

import java.util.Scanner;

public class Help_Ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] ride_rick = new int[n];
			for (int i = 0; i < ride_rick.length; i++) {
				ride_rick[i] = sc.nextInt();
			}
			
			int[] ride_cab = new int[m];
			for (int i = 0; i < ride_cab.length; i++) {
				ride_cab[i] = sc.nextInt();
			}
			
			System.out.println(minSum(c1, c2, c3, c4, ride_rick, ride_cab));
		}		
	}
	
	public static int minSum(int c1, int c2, int c3, int c4, int[]ride_rick, int[] ride_cab) {
		int total_cost_rick = 0;
		for (int i = 0; i < ride_rick.length; i++) {
			total_cost_rick += Math.min(ride_rick[i] * c1, c2);
		}
		
		total_cost_rick = Math.min(total_cost_rick, c3);
		
		int total_cost_cab = 0; 
		for (int i = 0; i < ride_cab.length; i++) {
			total_cost_cab += Math.min(ride_cab[i] * c1, c2);
		}
		
		total_cost_cab = Math.min(total_cost_cab, c3);
		
		return Math.min(total_cost_rick + total_cost_cab, c4);
	}

}
















