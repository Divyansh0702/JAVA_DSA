package Lec37;

import java.util.*;

public class HashSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Not duplicate values allowed "Set"
		HashSet<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(29);
		set.add(11);
		set.add(-21);
		set.add(9);
		set.add(19);
		set.add(-21);
		set.add(null);
		
		System.out.println(set);
		
//		// get
//		System.out.println(set.contains(9));
//
//		System.out.println(set.remove(9));
//		System.out.println(set);
		
		TreeSet<Integer> set1 = new TreeSet<>(); // increasing sorting order
		
		set1.add(1);
		set1.add(29);
		set1.add(11);
		set1.add(-21);
		set1.add(9);
		set1.add(19);
		set1.add(-21);
//		set1.add(null);
		
		System.out.println(set1);
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>(); // increasing sorting order
		
		set2.add(1);
		set2.add(29);
		set2.add(11);
		set2.add(-21);
		set2.add(9);
//		set2.add(null);
		set2.add(19);
		set2.add(-21);
		
		System.out.println(set2);
		
		for (int v : set1) {
			System.out.print(v + " ");
		}
		
		
	}

}
