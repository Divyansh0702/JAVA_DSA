package Lec18;
import java.util.*;
public class Keypad {
	
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "23";
		List<String> ll = new ArrayList<>();
		
		KeyPad(ques, "", ll);
		System.out.println(ll);
	}
	
	public static void KeyPad(String ques, String ans, List<String> ll){
		if(ques.length() == 0) {
//			System.out.println(ans);
			ll.add(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		String s = key[ch - '0']; // abc
		
		for(int i = 0; i < s.length(); i++) {
			KeyPad(ques.substring(1), ans + s.charAt(i), ll);
		}
	}

}

