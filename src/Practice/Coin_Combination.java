package Practice;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {2, 3, 5};
		int amount = 8;
		Combination(coins, amount, "", 0);
	}	
	
	public static void Combination(int[] coins, int amount, String ans, int idx) {
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = idx; i < coins.length; i++) {
			if(amount >= coins[i]) {
				Combination(coins, amount - coins[i], ans + coins[i], i);				
			}
		}
	}

}
