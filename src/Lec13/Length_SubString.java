package Lec13;

public class Length_SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		LenSubStr(s);
	}
	
	public static void LenSubStr(String s) {
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j -len;
				System.out.println(s.substring(i, j));
			}
			System.out.println();
		}
	}
}