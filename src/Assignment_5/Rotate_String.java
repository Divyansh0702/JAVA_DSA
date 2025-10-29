package Assignment_5;

import java.util.*;

public class Rotate_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
//		System.out.println(reverse(s));

		System.out.println(rotate(s, 3));
	}
	
	public static String rotate(String s, int k) {
		int n = s.length();
		k = k % n;
		
		String s1 = reverse(s, 0, n-k-1);
		s1 = reverse(s1, n-k, n-1);
		s1 = reverse(s1, 0, n-1);
		
		return s1;
	}
	
	public static String reverse(String s, int i, int j) {
		StringBuilder str = new StringBuilder(s);

		while(i < j) {
			char temp = str.charAt(i);
			str.setCharAt(i, str.charAt(j));
			str.setCharAt(j, temp);
			i++;
			j--;
		}
		return str.toString();
	}

}