package Lec16;

public class Print_SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		PrintSS(ques, "");
	}
	
	public static void PrintSS(String ques, String ans) {
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		
		PrintSS(ques.substring(1), ans);
		PrintSS(ques.substring(1), ans + ch);
		
	}
}
