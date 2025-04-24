package Assignment_7;
import java.util.*;
public class Stack_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		
		System.out.println(st);
		
		Reverse(st);
		System.out.println(st);
	}
	
	public static void Reverse(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		
		int val = st.pop();
		Reverse(st);
		AddLast(st, val);
	}

	public static void AddLast(Stack<Integer> st, int val) {
		if(st.isEmpty()){
			st.push(val);
			return;
		}
		
		int x = st.pop();
		AddLast(st, val);
		st.push(x);
	}
}
