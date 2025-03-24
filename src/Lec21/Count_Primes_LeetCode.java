package Lec21;

public class Count_Primes_LeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		
		int ans = count(n);
		System.out.println(ans);
	}
	
	public static int count(int n) {
		boolean prime[] = new boolean[n];
		
		int cnt = 0;
		if((n == 0) || (n == 1)) {
			return cnt;
		}
		
		else {
			for (int i = 2; i * i < prime.length; i++) {
				if(prime[i] == false) {
					for (int j = 2; i * j < prime.length; j++) {
						prime[i*j] = true;
					}
				}
			}
			
			for (int i = 2; i < prime.length; i++) {
				if(prime[i] == false) {
					cnt++;
//					System.out.println(i);
				}
			}
			return cnt;
		}
		
	}
}
