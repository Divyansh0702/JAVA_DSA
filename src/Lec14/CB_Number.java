package Lec14;

import java.util.Arrays;

public class CB_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "81615";
		System.out.println(CountCBNo(s));
	}	
	
	
	public static int CountCBNo(String s) {
		int cnt = 0;
		boolean[] visited = new boolean[s.length()];
		
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				long num = Long.parseLong(s.substring(i, j));
				if(IsCBNumber(num) && IsValid(visited, i, j)) {
					cnt++;
					
					Arrays.fill(visited, i, j, true);
//					for (int k = i; k < j; k++) {
//						visited[k] = true;
//					}
				}
			}
		}
		return cnt;
		
	}
	
	public static boolean IsValid(boolean[] visited, int i, int j) {
		for (int k = i; k < j; k++) {
			if(visited[k] == true) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean IsCBNumber(long num) {
		if(num == 0 || num == 1) {
			return false;
		}
		
		int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(num % arr[i] == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void CountCBNo(String s) {
//		int count = 0;
//		boolean visited[] = new boolean[s.length()];
//		for (int len = 1; len <= s.length(); len++) {
//			for (int j = len; j <= s.length(); j++) {
//				int i = j -len;
//				long num = Long.parseLong(s.substring(i, j));
//				if(isCBnumber(num) && IsValid(visited, i, j-1)) {
//					count++;
//					for (int k = i; k <= j-1; k++) {
//						visited[i] = true;
//					}
//				}
//			}
//		}
//		System.out.println(count);
//	}
//	
//	public static boolean IsValid(boolean[] visited, int i, int j) {
//		for (int k = 0; k <= j; k++) {
//			if(visited[k] == true) {
//				return false;
//			}
//		}
//		return true;
//	}
//	
//	public static boolean isCBnumber(long num) {
//		if(num == 0 || num == 1) {
//			return false;
//		}
//		int arr[] = {2,3,5,7,11,13,17,19,23,29};
//		for (int i = 0; i < arr.length; i++) {
//			if(num == arr[i]) {
//				return true;
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			if(num % arr[i] == 0) {
//				return false;
//			}
//		}
//		return true;
//	}

}
