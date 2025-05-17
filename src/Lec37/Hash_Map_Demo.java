package Lec37;

import java.util.*;

public class Hash_Map_Demo {
	
	public static void main(String[] args) {
//		Map<String, Integer> map = new HashMap<>();
		HashMap<String, Integer> map = new HashMap<>();
		// made from single linked list
		// it is like "SET"
		map.put("Raj", 77);
		map.put("Vivek", 57);
		map.put("Ankit", 87);
		map.put("Raju", 77);
		map.put("Ankita", 67);
		map.put("Pooja", 53);
		map.put("Kunal", 55);
		map.put("null", 55); // Only one key is allowed to be null but we can put value to be null as many as want 
	
		System.out.println(map);
//
//		System.out.println(map.containsKey("Amisha"));
//		System.out.println(map.containsKey("Ankita"));
//		
//		System.out.println(map.get("Amisha"));
//		System.out.println(map.get("Ankit"));
//		
//		System.out.println(map.remove("Ankit"));
//		System.out.println(map.remove("Amisha"));
//		
//		System.out.println(map);
		
		TreeMap<String, Integer> map1 = new TreeMap<>(); // arranges in alphabetical order
		// made from red-black tree
		map1.put("Raj", 77);
		map1.put("Vivek", 57);
		map1.put("Ankit", 87);
		map1.put("Raju", 77);
		map1.put("Ankita", 67);
		map1.put("Pooja", 53);
		map1.put("Kunal", 55);
		map1.put("Ankita", 55);
//		map1.put(null, 55);
	
		System.out.println(map1);
		
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// made from doubly linked list
		map2.put("Raj", 77);
		map2.put("Vivek", 57);
		map2.put("Ankit", 87);
		map2.put("Raju", 77);
		map2.put("Ankita", 67);
		map2.put("Pooja", 53);
		map2.put("Kunal", 55);
		map2.put("Ankita", 55);
//		map2.put(null, 55);
		
		System.out.println(map2);
		
//		for(String key : map.keySet()) {
//			System.out.println(key + " " + map.getKey());
//		}
		
		
		
	}	
}
