package Lec17;

public class Is_Present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "ababcdeaacc";
		int i = 3;
		char ch = 'a';
		System.out.println(isPresent(ques, i, ch));
	}
	
	public static boolean isPresent(String ques, int i, char ch) {
		for(int j = i+1; j < ques.length(); j++) {
			if(ques.charAt(j) == ch) {
				return true;
			}
		}
		return false;
	}

}
