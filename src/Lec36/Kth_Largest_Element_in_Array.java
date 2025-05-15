package Lec36;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Largest_Element_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,3,1,2,4,5,5,6};
		int k = 3;
		System.out.println(KLargestElem(arr, k));
	}
	
	public static int KLargestElem(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(); //min-heap
//		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //max-heap
		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if(arr[i] > pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
	}

}
