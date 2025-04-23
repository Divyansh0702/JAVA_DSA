package Assignment_6;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		
		TossCoin(n, "");
	}
	
	public static void TossCoin(int n, String ans) {
		if(n == 0) {
			System.out.println(ans);
			return;
		}
		
		TossCoin(n-1, ans + "H");
		TossCoin(n-1, ans + "T");
	}
}
