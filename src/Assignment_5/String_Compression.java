package Assignment_5;

public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "aaabbccdsaa";
		String s = "aaabbccds";
		
		
		System.out.println(compress(s));
	}
	
	public static String compress(String s) {

		int i = 0;
//		String ans = "";
		StringBuilder ans = new StringBuilder();
		
		while(i < s.length()) {
			char ch = s.charAt(i);
			int count = 0;
			
			int j = i;
			while(j < s.length() && ch == s.charAt(j)){
				count++;
				j++;
			}
			
			if(count == 1) {
				ans.append(ch);
			}
			else {
				ans.append(ch).append(count);				
			}
			i = j;
		}
		
		return ans.toString();
	}

}
