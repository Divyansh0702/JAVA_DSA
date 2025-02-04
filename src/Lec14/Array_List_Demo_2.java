package Lec14;

import java.util.ArrayList;

public class Array_List_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>(); //default capacity of ArrayList is 10 but we can change the capacity by just passing it in the arg.
		ll.add(10);		
		ll.add(1);
		ll.add(10);
		ll.add(-8);
		ll.add(10);		
		ll.add(1);
		ll.add(10);
		ll.add(-8);
		ll.add(-8);
		ll.add(-8);
		ll.add(-7);
		System.out.println(ll);
		System.out.println(ll.size());
		
//		for (int i = 0; i < ll.size(); i++) {
//			System.out.print(ll.get(i) + " ");
//		}
//		System.out.println();
//		
//		int[] arr = new int[6];
//		for(int x : arr) {
//			System.out.print(x + " ");
//		}
//		
//		System.out.println();
//		for(int x : ll) {
//			System.out.print(x + " ");
//		}
		
	}

}
