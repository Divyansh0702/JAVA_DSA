package Lec25;

public class Queue {
	private int[] arr;
	private int front = 0;
	private int size = 0;
	
	public Queue() {
		this(5);
	}
	
	public Queue(int n) {
		arr = new int[n];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == arr.length;
	}
	
	public int size() {
		return size;
	}
	
	public void Enqueue(int item) throws Exception{
		if(isFull()) {
			throw new Exception("Bklol queue full hai");
		}
//		arr[size] = item;
//		int idx = front + size;  Linear Queue
		int idx = (front + size) % arr.length; // Circular Queue 
		arr[idx] = item;
		size++;		
	}
	
	public int Dequeue() throws Exception{
		if(isEmpty()) {
			throw new Exception("Bklol queue khali hai");
		}
		int val = arr[front];
//		front++;  Linear Queue
		front = (front + 1) % arr.length; // Circular Queue
		size--;
		return val;
	}
	
	public int getfront() {
		int val = arr[front];
		return val;
	}
	
	public void Display() {
		for (int i = 0; i < size ; i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx] + " ");
		}
	}
	
	
	
	 
	
	
	
}
