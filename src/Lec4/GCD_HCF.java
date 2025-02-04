package Lec4;

public class GCD_HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 60;
		int divisor = 36;
		while(dividend % divisor != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(divisor);
	}

}
