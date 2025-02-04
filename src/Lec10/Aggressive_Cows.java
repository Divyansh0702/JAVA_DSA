package Lec10;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int nos = sc.nextInt();
			int noc = sc.nextInt();
			int[] stall = new int[nos];
			for(int i=0; i<stall.length; i++) {
				stall[i] = sc.nextInt();
			}
			Arrays.sort(stall);
			System.out.println(Min_dist(stall, noc));
		}
	}
	
	public static int Min_dist(int[] stall, int noc) {
		int low = 0;
		int high = stall[stall.length - 1] - stall[0]; // 9-1 = 8
		int ans = 0;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(isitpossible(stall, noc, mid)) {
				ans = mid;
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return ans;
	}
	
	public static boolean isitpossible(int[] stall, int noc, int mid) {
		int cow = 1, pos = stall[0];
		for (int i = 1; i < stall.length; i++) {
			if(stall[i] - pos >= mid) {
				pos = stall[i];
				cow++;
			}
			if(cow == noc) {
				return true;
			}
		}
		return false;
		
	}

}









