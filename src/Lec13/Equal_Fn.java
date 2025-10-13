package Lec13;

public class Equal_Fn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = new String("hello");
//		System.out.println(s1.equals(s2));
//		System.out.println(Equals(s1, s2));
		System.out.println(isEquals(s1, s2));
	}
	
	public static boolean isEquals(String s1, String s2) {
		if(s1 == s2) {
			return true;
		}
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	
	

	
//	public static boolean Equals(String s1, String s2) {
//		if(s1 == s2) {
//			return true;
//		}
//		if(s1.length() != s2.length()) {
//			return false;
//		}
//		for (int i = 0; i < s1.length(); i++) {
//			if(s1.charAt(i) != s2.charAt(i)) {
//				return false;
//			}
//		}
//		return true; 
//	}
}
