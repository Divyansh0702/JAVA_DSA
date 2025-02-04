package Lec6;

import java.util.Scanner;

public class Boston_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(BostonNum(n));
		
	}
	
	public static int BostonNum(int n) {
		return (SumOfPrimeFactor(n) == SumOfDigits(n))? 1 : 0;
	}
	
	public static int SumOfPrimeFactor(int n) {
		int i = 2;
		int sum = 0;
		while(i <= n) {
			if(n % i == 0){
				sum += SumOfDigits(i);
				n = n / i;				
			}
			else {
				i++;				
			}
		}
		return sum;
	}
	
	public static int SumOfDigits(int n) {
		int sum = 0;
		while(n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		return sum;
	}

}
