package Lec13;

public class String_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		s1 = s1 + " bye"; //s1.concat("bye");
		System.out.println(s1);
		
		String s5 = "hello" + "hey";
		System.out.println(s5);
		
		System.out.println(s1.length()); // method
		
		System.out.println(s1.charAt(4)); //0 based-index
	}

}
