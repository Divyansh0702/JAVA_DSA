package Lec15;

public class Sum_Of_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(Sum(n));
	}
	public static int Sum(int n) {
		if(n == 0) {
			return 0;
		}
		int s = Sum(n-1);
		return s + n;
	}

}