package Assignment_6;

public class Coin_Toss2 {

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
		
		if(ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			TossCoin(n-1, ans + "H");			
		}
		TossCoin(n-1, ans + "T");
	}
	

}
