package Lec30;

import java.util.LinkedList;

public class Stack_Using_LinkedList {

	private LinkedList<Integer> ll = new LinkedList<>();
	
	public void push(int item) {
		ll.addFirst(item);
	}

	public int pop() {
		return ll.remove();
	}

	public int peek() {
		return ll.get(0);
	}
	
	public static void main(String[] args) {
		Stack_Using_LinkedList sl = new Stack_Using_LinkedList();
		sl.push(10);
		sl.push(50);
		sl.push(40);
		sl.push(20);
		
		
	}
	

}
