package Assignment_4;

import java.util.*;

public class Square_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(Sqrt(n));
	}
	
	public static int Sqrt(int n) {
		int low = 1;
		int high = n / 2;
		int ans = 1;
		
		if(n < 2) {
			return n;
		}
		while(low <= high) {
			int mid = low + (high - low ) / 2;
			long square = (long)mid * mid;
			
			if(square == n) {
				return mid;
			}
			else if(square < n) {
				ans = mid; //Storing possible floor value
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return ans;
	}

}
