package Assignment_3;
import java.util.*;

public class Von_NeumanBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			String n = sc.next();
			if(isBinary(n)) {
				System.out.println(Bin_Dec(n));				
			}
		}
	}
	
//	public static int Bin_Dec(int n) {
//		int sum = 0, mul = 1;
//		while(n > 0) {
//			int rem = n % 10;
//			sum += rem * mul;
//			n /= 10;
//			mul = mul * 2;
//		}
//		return sum;
//	}
//	
//	public static boolean isBinary(int n) {
//		while(n > 0) {
//			int rem = n%10;
//			if(rem != 1 && rem != 0) {
//				return false;
//			}
//			n /= 10;
//		}
//		return true;
//	}
	
	public static int Bin_Dec(String n) {
		int sum = 0, mul = 1;
		for (int i = n.length()-1; i >= 0; i--) {
			int bit = n.charAt(i) - '0';
			sum += bit * mul;
			mul = mul * 2;
		}
		return sum;
	}
	
	public static boolean isBinary(String n) {
		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);
			if(ch != '0' && ch != '1') {
				return false;
			}
		}
		return true;
	}
}
