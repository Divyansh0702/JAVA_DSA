package Lec17;

import java.util.*;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int open = 0;
		int close = 0;
		String ans = "";
		List<String> ll = new ArrayList<>();
//		Parentheses(n, open, close, ans);
		
		GenerateParentheses(n, open, close, ans, ll);
		System.out.println(ll);

	}
	
	public static void Parentheses(int n, int open, int close, String ans) {
		if(open == n && close == n) {
			System.out.println(ans);
		}
//		if(open < n) {
//			Parentheses(n, open + 1, close, ans + "(");
//		}
//		
//		if(close < open) {
//			Parentheses(n, open, close + 1, ans + ")");			
//		}
		
		if(open > n || close > open) {
			return;
		}
		
		Parentheses(n, open + 1, close, ans + "(");
		Parentheses(n, open, close + 1, ans + ")");
	}
	
	public static void GenerateParentheses(int n, int open, int close, String ans, List<String> ll) {
		if(open == n && close == n) {
			ll.add(ans);
			return;
		}
		
//		if(open > n || close > open) {
//			return;
//		}
		if(open < n) {
			GenerateParentheses(n, open + 1, close, ans + "(", ll);
		}
		
		if(close < open) { 
			GenerateParentheses(n, open, close + 1, ans + ")", ll);			
		}
		
	}
}




