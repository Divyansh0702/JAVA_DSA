package Lec26;

import java.util.*;

public class Add_Last_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println(s);
		
		Add_Last(s, -6);
		
		System.out.println(s);
	}
	
	public static void Add_Last(Stack<Integer> s, int item) {
		if(s.isEmpty()) {
			s.push(item);
			return;
		}
		
		int val = s.pop();
		Add_Last(s, item);
		s.push(val);
		 
	}
	

}
