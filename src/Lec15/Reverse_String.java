package Lec15;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		int i = s.length()-1;
		Reverse(s, i);
	}
	
	public static void Reverse(String s, int i) {
		if(i < 0) {
			return;
		}
		System.out.print(s.charAt(i));
		Reverse(s, i-1);
	}

}
   