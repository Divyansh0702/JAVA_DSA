package Assignment_5;

public class Toggle_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AbC";
		
		System.out.println(ToggleAscii(s));
	}

	public static String ToggleAscii(String s) {
		StringBuilder res = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			res.append((char)(s.charAt(i) ^ 32));
		}
		
		return res.toString();
	}
//	public static String Toggle(String s) {
//		StringBuilder res = new StringBuilder();
//		
//		for (int i = 0; i < s.length(); i++) {
//			
//			char ch = s.charAt(i);
//			if(Character.isLowerCase(ch)){
//				res.append(Character.toUpperCase(ch));
//			}
//			else {
//				res.append(Character.toLowerCase(ch));
//			}
//		}
//		
//		return res.toString();
//	}
}
