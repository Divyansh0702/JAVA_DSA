package Lec25;

public class Stack {
//	private int[] arr;
	protected int[] arr;
	protected int idx = -1;
	
	public Stack() {
//		arr = new int[5];
		this(5);
	}
	
	public Stack(int n) {
		arr = new int[n];
	}
	
	public boolean isEmpty() {
		return idx == -1;
	}
	
	public boolean isFull() {
		return idx == arr.length - 1;
	}
	
	public int size() {
		return idx + 1;
	}
	
	public void push(int item) throws Exception{
		if(isFull()) {
			throw new Exception("Bklol stack full hai");
		}
		idx++;
		arr[idx] = item;
	}
	
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Bklol stack empty hai");
		}
		int val = arr[idx];
		idx--;
		return val;
	}
	
	public int peek() {
		int val = arr[idx];
		return val;
	}
	
	public void Display() {
		for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}


















