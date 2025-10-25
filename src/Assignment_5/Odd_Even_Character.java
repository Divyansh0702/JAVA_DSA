package Assignment_5;

import java.util.*;

public class Odd_Even_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		StringBuilder str = new StringBuilder(s);
		
		replace(str);
		
		System.out.println(str);
	}
	
	public static void replace(StringBuilder str) {
		for (int i = 0; i < str.length(); i++) {
			int ascii = str.charAt(i);
			if(i % 2 == 0) {
				str.setCharAt(i, (char)(++ascii));
			}
			else {
				str.setCharAt(i, (char)(--ascii));
			}
		}
	}

}
