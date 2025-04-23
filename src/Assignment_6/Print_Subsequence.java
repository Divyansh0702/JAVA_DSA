package Assignment_6;

import java.util.Scanner;

public class Print_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
//		String ques = "abc";
		
		PrintSubSeq(ques, "");
		System.out.println();
		System.out.println(CountSubSeq(ques, ""));
	}
	public static void PrintSubSeq(String ques, String ans) {
		if(ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}
		
		char ch = ques.charAt(0);
		PrintSubSeq(ques.substring(1), ans);
		PrintSubSeq(ques.substring(1), ans + ch);
		
	}
	
	public static int CountSubSeq(String ques, String ans) {
		if(ques.length() == 0) {
			return 1;
		}
		
		char ch = ques.charAt(0);
		int a1 = CountSubSeq(ques.substring(1), ans);
		int a2 = CountSubSeq(ques.substring(1), ans + ch);
		return a1 + a2;
	}

}
