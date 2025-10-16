package Lec13;

import java.util.*;

public class Rohit_Virat_Playing_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "sea";
		String s2 = "eat";
		
		System.out.println(lowestASCII(s1, s2));
	}
	
	public static int lowestASCII(String s1, String s2) {
		HashMap<String, Integer> freq = new HashMap<>();
		
		String[] arr1 = s1.split(" *");
		String[] arr2 = s2.split(" *");
		
		for(String word : arr1) {
			freq.put(word, freq.getOrDefault(word, 0) + 1);
		}
		
		for(String word : arr2) {
			freq.put(word, freq.getOrDefault(word, 0) + 1);
		}
		
		int sum = 0;
		for(Map.Entry<String, Integer> entry : freq.entrySet()) {
			if(entry.getValue() == 1) {
				String word = entry.getKey();
				
				for(char ch : word.toCharArray()) {
					sum += ch;
				}
				
			}
		}
		return sum;
	}

}
