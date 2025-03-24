package Lec21;

public class Sieve_Of_Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100; 
		
		prime_sieve(n);
	}
	
	public static void prime_sieve(int n) {
		boolean prime[] = new boolean[n + 1];
		prime[0] = true;
		prime[1] = true;
		
		for (int i = 2; i * i < prime.length; i++) {
			if(prime[i] == false) {
				for (int j = 2; i * j < prime.length; j++) {
					prime[i*j] = true;
				}
			}
		}
		
		for (int i = 2; i < prime.length; i++) {
			if(prime[i] == false) {
				System.out.println(i);
			}
		}
	}

}
