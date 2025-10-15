package Lec13;

import java.util.Scanner;

public class Playing_Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
//		System.out.println(Good_String(s));
		System.out.println(goodString(s));
	}
	
	public static int goodString(String s){
		int ans = 0;
		int cnt = 0;

		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || 
			s.charAt(i) == 'o' || s.charAt(i) == 'u'){
				cnt += 1;
				ans = Math.max(ans, cnt);
			}
			else {
				cnt = 0;					
			}
		}

		return ans;
	}
	
//	public static int Good_String(String s) {
//		int cnt = 0, ans = 0;
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if(isVowels(ch)) {
//				cnt++;
//			}
//			else {
//				ans = Math.max(ans, cnt);
//				cnt = 0;
//			}
//			ans = Math.max(ans, cnt);
//		}
//		return ans;
//	}
//	public static boolean isVowels(char ch) {
//		if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u') {
//			return true;
//		}
//		return false;
//	}

}
