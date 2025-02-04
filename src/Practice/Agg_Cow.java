package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Agg_Cow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nos = sc.nextInt();
		int noc = sc.nextInt();
		int[] stall = new int[nos];
		for (int i = 0; i < stall.length; i++) {
			stall[i] = sc.nextInt();
		}
		Arrays.sort(stall);
		System.out.println(min_dist(stall, noc));
		
	}
	public static int min_dist(int[] stall, int noc) {
		int low = 0;
		int high = stall[stall.length-1] - stall[0];
		int ans = 0;
		while(low <= high) {
			int mid = low + (high-low)/2;
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
		for(int i=1; i<stall.length; i++) {
			if(stall[i] - pos >= mid) {
				cow++;
				pos = stall[i];
			}
			if(cow == noc) {
				return true;
			}
		}
		return false;
	}

}














