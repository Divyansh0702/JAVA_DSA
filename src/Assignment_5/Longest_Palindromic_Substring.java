package Assignment_5;

import java.util.*;

public class Longest_Palindromic_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Axis_Orbit("nitin"));
		
//		for (String i : res) {
//			System.out.print(i + " ");
//		}
		
	}
	
	public static String Axis_Orbit(String s) {
		String ans = "";
		
		String odd = "";
		for (int axis = 0; axis < s.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
				if(s.charAt(axis - orbit) != s.charAt(axis + orbit)) {
					break;
				}
				odd = s.substring(axis - orbit, axis + orbit + 1);
				if(odd.length() > ans.length()) {
					ans = odd;
				}
			
			}
		}
		
		String even = "";
		for (double axis = 0.5; axis < s.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
				if(s.charAt((int)(axis - orbit)) != s.charAt((int)(axis + orbit))) {
					break;
				}
				even = s.substring((int)(axis - orbit), (int)(axis + orbit + 1));
				if(even.length() > ans.length()) {
					ans = even;
				}
		
			}
		}
		
		return ans;
	}

}
