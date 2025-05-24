package Lec38;

public class Valid_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "anagram", t = "nagaram";
		 
		 System.out.println(IsAnagrams(s, t));
	}
	
	public static boolean IsAnagrams(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int idx = s.charAt(i) - 'a';
			freq[idx] = freq[idx] + 1;
			
			idx = t.charAt(i) - 'a';
			freq[idx] = freq[idx] - 1;
//			freq[s.charAt(i) - 'a']++;
//			freq[t.charAt(i) - 'a']--;
		}
		
		for(int c : freq) {
			if(c != 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
