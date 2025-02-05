package Lec16;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end = 4;
		int curr = 0;
		String ans = "";
		
//		Steps(curr, end, ans); 
		System.out.println(CSteps(curr, end, ans));
	}
	
	public static void Steps(int curr, int end, String ans) {
		if(curr > end) {
			return;
		}
		else if(curr == end) {
			System.out.println(ans);
			return;
		}
		
//		Steps(curr + 1, end, ans + "1");
//		Steps(curr + 2, end, ans + "2");
//		Steps(curr + 3, end, ans + "3");
		for (int dice = 1; dice <= 3; dice++) {
			Steps(curr + dice, end, ans + dice);
		}
	}
	
	public static int CSteps(int curr, int end, String ans) {
		if(curr > end) {
			return 0;
		}
		else if(curr == end) {
			System.out.println(ans);
			return 1;
		}
		
		int cnt = 0;
		
		for (int dice = 1; dice <= 3; dice++) {
			cnt += CSteps(curr + dice, end, ans + dice);
		}
		return cnt;
	}
}
