package Lec16;

public class Print_SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
//		PrintSS(ques, "");
//		System.out.println(count);
		System.out.println(CountSS(ques, ""));
	}
	
//	static int count = 0;
	
	public static void PrintSS(String ques, String ans) {
		if(ques.length() == 0) {
			System.out.println(ans);
//			count++;
			return;
		}
		
		char ch = ques.charAt(0);
		
		PrintSS(ques.substring(1), ans);
		PrintSS(ques.substring(1), ans + ch);
	}
	
	public static int CountSS(String ques, String ans) {
		if(ques.length() == 0) {
			System.out.println(ans);
			return 1;
		}
		
		char ch = ques.charAt(0);
		
		int a1 = CountSS(ques.substring(1), ans);
		int a2 = CountSS(ques.substring(1), ans + ch);
		return a1 + a2;
	}
}
