package Lec13;

import java.util.Arrays;

public class Reverse_Words_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  the sky is   blue  ";
		s = s.trim(); //leading and trailing spaces will be deleted
		
		String[] arr = s.split(" +"); 
//		System.out.println(Arrays.toString(arr));
		
		String ans = "";
		for (int i = arr.length-1; i >= 0; i--) {
			ans = ans + arr[i] + " ";
		}
		System.out.print(ans);
	}

}
