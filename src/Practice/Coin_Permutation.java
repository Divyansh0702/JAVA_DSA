package Practice;

public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {2, 3, 5};
		int amount = 8;
		Permutation(coins, amount, "");
	}	
	
	public static void Permutation(int[] coins, int amount, String ans) {
		if(amount == 0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < coins.length; i++) {
			if(amount >= coins[i]) {
				Permutation(coins, amount - coins[i], ans + coins[i]);				
			}
		}
	}
}
