package Lec23;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = pow(3, 5);
		System.out.println(ans);
	}
	
	public static int pow(int a, int n) {
		if(n == 0) {
			return 1;
		}
		
		int ans = pow(a, n / 2);
		ans = ans * ans;
		
		if(n % 2 != 0) {
			ans *= a;
		}
		return ans;
	}

}
