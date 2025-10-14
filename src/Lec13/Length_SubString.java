package Lec13;

public class Length_SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		
		Len_Sub(s1);
	}

	public static void Len_Sub(String s1) {
		for(int len = 1; len <= s1.length(); len++) {
			for(int j = len; j <= s1.length(); j++) {
				int i = j - len;
				System.out.println(s1.substring(i,j));
			}
			System.out.println();
		}
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void LenSubStr(String s) {
//		for (int len = 1; len <= s.length(); len++) {
//			for (int j = len; j <= s.length(); j++) {
//				int i = j -len;
//				System.out.println(s.substring(i, j));
//			}
//			System.out.println();
//		}
//	}
}