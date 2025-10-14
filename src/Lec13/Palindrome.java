package Lec13;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "naman";
		System.out.println(isPalindrome(s1));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean isPalindrome(String s1) {
		int i=0;
		int j=s1.length()-1;
		while(i < j) {
			if(s1.charAt(i) != s1.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
