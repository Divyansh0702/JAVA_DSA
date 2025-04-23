package Assignment_6;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		
		RollDice(0, n, "");
	}
	
	public static void RollDice(int curr, int end, String ans) {
		if(curr > end) {
			return;
		}
		if(curr == end) {
			System.out.println(ans);
			return;
		}
		
		
//		RollDice(curr + 1, end, ans + "1");
//		RollDice(curr + 2, end, ans + "2");
//		RollDice(curr + 3, end, ans + "3");
		
		for (int i = 1; i <= 3; i++) {
			RollDice(curr + i, end, ans + i);
		}
		
	}

}
