package Lec36;

import java.util.PriorityQueue;

public class Heap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap hp = new Heap();
		hp.add(10);
		hp.add(20);
		hp.add(30);
		hp.add(5);
		hp.add(7);
		hp.add(2);
		
		hp.Display();
		
		System.out.println(hp.remove());
		
		hp.Display();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(5);
		pq.add(7);
		pq.add(2);
		
		System.out.println(pq);

		System.out.println(pq.peek());
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
	}

}
