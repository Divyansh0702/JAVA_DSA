package Lec13;

import java.util.Scanner;

public class Playing_Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(Good_String(s));
	}
	
	public static int Good_String(String s) {
		int cnt = 0, ans = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(isVowels(ch)) {
				cnt++;
			}
			else {
				ans = Math.max(ans, cnt);
				cnt = 0;
			}
			ans = Math.max(ans, cnt);
		}
		return ans;
	}
	public static boolean isVowels(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u') {
			return true;
		}
		return false;
	}

}
