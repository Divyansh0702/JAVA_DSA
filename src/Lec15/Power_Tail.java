package Lec15;

public class Power_Tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int n = 4;
		System.out.println(pow(a, n, 1));
	}
	
	public static int pow(int a, int n, int ans) {
		if(n == 0) {
			return ans;
		}
		return pow(a, n-1, a * ans);
	}
}
