package Lec26;

import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "IDDIIDII";
		int n = pattern.length();
		int[] res = new int[n+1];
		
		System.out.println(Construct(pattern, res));
		
	}
	
	public static String Construct(String pattern, int[] res) {
		Stack<Integer> st = new Stack<>();
		int cnt = 1;
		for (int i = 0; i <= pattern.length(); i++) {
			if(i == pattern.length() || pattern.charAt(i) == 'I') {
				res[i] = cnt;
				cnt++;
				while(!st.isEmpty()) {
					res[st.pop()] = cnt;
					cnt++;
				}
			}
			else {
				st.push(i);
			}
		}
		
		String nums = "";
		for (int i = 0; i < res.length; i++) {
			nums += res[i];
		}
		
		return nums;
	}
}
