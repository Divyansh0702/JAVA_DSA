package Lec26;

import java.util.Stack;

public class Stack_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println(s);
		
		Reverse(s);
		
		System.out.println(s);
	}
	
	public static void Reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		
		int val = s.pop();
		Reverse(s);
		Add_Last(s, val);
	}
	
	public static void Add_Last(Stack<Integer> s, int item) {
		if(s.isEmpty()) {
			s.push(item);
			return;
		}
		
		int x = s.pop();
		Add_Last(s, item);
		s.push(x);
		
	}
	

}
