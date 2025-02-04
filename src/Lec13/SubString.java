package Lec13;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
//		System.out.println(s.substring(2,7));
//		System.out.println(s.substring(2));
//		System.out.println(s.substring(0,1));
		
		allSubStrings(s);			
	}
	
	public static void allSubStrings(String s) {
		for (int i = 0; i < s.length() ; i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
			System.out.println();
		}
	}

}
