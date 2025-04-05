package Lec26;

import Lec25.Queue;

public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
			
		q.Display();
	
		Reverse(q);
		
		System.out.println();
		q.Display();
	}
	
	public static void Reverse(Queue q) throws Exception {
		if(q.isEmpty()) {
			return;
		}
		int val = q.Dequeue();
		Reverse(q);
		q.Enqueue(val);
	}

}
