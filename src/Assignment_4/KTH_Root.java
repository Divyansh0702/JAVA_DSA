package Assignment_4;
import java.util.*;
import java.util.Scanner;

public class KTH_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			long n = sc.nextInt();
			int k = sc.nextInt();
			System.out.println(KthRoot(n, k));
		}		
		
	}
	
	public static int KthRoot(long n, int k) {
		long low = 1;
		long high = n;
		long x = 0;
		while(low <= high) {
			long mid = low + (high - low) / 2;
			if(Math.pow(mid, k) <= n) {
				x = mid;
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return (int)x;
	}
}
