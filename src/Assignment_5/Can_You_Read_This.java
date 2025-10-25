package Assignment_5;

import java.util.*;

public class Can_You_Read_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "IAmACompetitiveProgrammer";
		String[] s = str.split("(?=[A-Z])");
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
//		System.out.println(findCount(str));

	}
	
//	Count
//	public static int findCount(String str) {
//		int cnt = 0;
//		
//		for (int i = 0; i < str.length(); i++) {
//			if(Character.isUpperCase(str.charAt(i))) {
//				cnt++;
//			}
//		}
//		return cnt;
//	}

}
