package Assignment_5;

import java.util.*;

public class Difference_In_ASCII_Codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String s = sc.next(); // acb
		StringBuilder str = new StringBuilder(s);
		
		System.out.println(difference(str));
	}
	
	public static String difference(StringBuilder str) {
		StringBuilder ans = new StringBuilder();
		
		int i = 0;
		while(i < str.length() - 1) {
			int j = i + 1;
			
			if(i == 0) {
				ans.append(str.charAt(i));				
			}
			int diff = str.charAt(j) - str.charAt(i);
			ans.append(diff).append(str.charAt(j));
			
			i++;			
		}
		return ans.toString();
	}

}
