package Assignment_4;

import java.util.Scanner;

public class KTH_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			long n = sc.nextInt();
			long k = sc.nextInt();
			System.out.println(KthRoot(n, k));
		}		
		
	}
	
	public static long KthRoot(long n, long k) {
		long low = 1;
		long high = n;
		long x = 0;
		while(low <= high) {
			long mid = low + (high - low) / 2;	
			long root = (long)Math.pow(mid, k);  
			if(root <= n) {
				x = mid;
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return x;
	}
	

}
