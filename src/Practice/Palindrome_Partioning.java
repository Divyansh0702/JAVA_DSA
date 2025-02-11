package Practice;
import java.util.*;

public class Palindrome_Partioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "nitin";
		List<String> ll = new ArrayList<>();
		List<List<String>> res = new ArrayList<>();
		
		Partition(ques, "", ll, res);
		System.out.println(res);
	}	
	
	public static void Partition(String ques, String ans, List<String> ll, List<List<String>> res) {
		if( ques.length() == 0) {
//			System.out.println(ans);
			res.add(new ArrayList<>(ll));
			return;
		}
	
		for (int i = 0; i < ques.length(); i++) {
			String s = ques.substring(0, i+1);
			if(isPalindrome(s)) {
				ll.add(s);
//				Partition(ques.substring(i+1), ans + s + "|");				
				Partition(ques.substring(i+1), ans + s, ll, res);
				ll.remove(ll.size() - 1);
			}
		}
	}
	
	public static boolean isPalindrome(String ques){
		int i = 0;
		int j = ques.length()-1;
		while(i < j) {
			if(ques.charAt(i) != ques.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
