package Lec13;

import java.util.Arrays;

public class Reverse_Words_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "a good   example";
		s = s.trim();
		
		System.out.println(reverse(s));
	}
	
	public static String reverse2(String s) {
		s = s.trim();
		 
		String[] arr = s.split(" +");
		StringBuilder rev = new StringBuilder();
		
		for (int i = arr.length - 1; i >= 0; i--) {
			rev.append(arr[i]);
			if(i > 0) {
				rev.append(" ");
			}
		}
		
		return rev.toString();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String reverse(String s) {
		s = s.trim();
		
		String[] arr = s.split(" +");
		
		String rev = "";
		
		for (int i = arr.length-1; i >= 0; i--) {
			rev = rev + arr[i] + " ";
		}
		
		return rev.trim();
	}
}




//		String[] arr = s.split(" +"); // by putting '+', it targets the multiple spaces between the words
//		System.out.println(Arrays.toString(arr));
//		
//		int i = 0;
//		int j = arr.length - 1;
//		
//		while(i < j) {
//			String temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//			i++;
//			j--;
//		}
//		
//		for (int k = 0; k < arr.length; k++) {
//			System.out.print(arr[k] + " ");
//		}
		
		
		
		
		
		
		
		
		
		
//		String s = "  the sky is   blue  ";
//		s = s.trim(); //leading and trailing spaces will be deleted
//		
//		String[] arr = s.split(" +"); 
////		System.out.println(Arrays.toString(arr));
//		
//		String ans = "";
//		for (int i = arr.length-1; i >= 0; i--) {
//			ans = ans + arr[i] + " ";
//		}
//		System.out.print(ans);
