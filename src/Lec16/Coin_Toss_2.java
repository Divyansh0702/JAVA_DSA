package Lec16;

public class Coin_Toss_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins = 3;
		String ans = "";
//		Toss(coins, ans);
		System.out.println(CToss(coins, ans));
	}
	
	public static void Toss(int coins, String ans) {
		if(coins == 0) {
			System.out.println(ans);
			return;
		}
		if(ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			Toss(coins - 1, ans + "H");			
		}
		Toss(coins - 1, ans + "T");
	}
	
	public static int CToss(int coins, String ans) {
		if(coins == 0) {
			System.out.println(ans);
			return 1;
		}
		
		int a1 = 0;
		
		if(ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			a1 = CToss(coins - 1, ans + "H");			
		}
		int a2 = CToss(coins - 1, ans + "T");
		return a1 + a2;
	}
}
