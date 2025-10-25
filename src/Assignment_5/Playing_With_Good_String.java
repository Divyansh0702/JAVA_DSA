package Assignment_5;

import java.util.Scanner;

public class Playing_With_Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String s = sc.next(); // cbaeicde
		System.out.println(GoodString(s));
	}
	
	public static int GoodString(String s) {
		int cnt = 0;
		int ans = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || 
					s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				cnt++;
			}
			else {
				cnt = 0;
			}
			
			ans = Math.max(ans, cnt);
		}
		
		return ans;
	}

}
