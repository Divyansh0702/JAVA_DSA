package Assignment_7;
import java.util.*;

public class Add_Last_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		
		AddLast(st, 100);
		
		System.out.println(st);
	}
	
	public static void AddLast(Stack<Integer> st, int item) {
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		
		int val = st.pop();
		AddLast(st, item);
		st.push(val);
	}

}
