package Lec30;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Using_LinkedList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedList<Integer> ll = new LinkedList<>();
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(70);
		q.add(50);
		System.out.println(q.poll()); // remove() 
		System.out.println();
		
	}

}
