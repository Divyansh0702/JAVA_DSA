package Practice;
import java.util.*;

public class KeyPad_Recursion {
	
	static String[] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "23";
		List<String> ll = new ArrayList<>();
		
		Combinations(digits, "", ll);
		System.out.println(ll);
	}
	
	public static void Combinations(String digits, String ans, List<String> ll) {
		if(digits.length() == 0) {
//			System.out.println(ans);
			ll.add(ans);
			return;
		}
		
		char ch = digits.charAt(0);
		String s = key[ch - '0'];
		
		for(int i=0; i<s.length(); i++) {
			Combinations(digits.substring(1), ans + s.charAt(i), ll);
		}
		
	}

}
