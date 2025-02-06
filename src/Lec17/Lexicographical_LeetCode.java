package Lec17;
import java.util.*;
public class Lexicographical_LeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		List<Integer> ll = new ArrayList<>();
		LexicoCounting(n, 0, ll);
		System.out.println(ll);
	}
	
	public static void LexicoCounting(int n, int curr, List<Integer> ll) {			
		if(curr > n) {
			return;
		}
		
		if(curr != 0) {
			ll.add(curr);
		}		
		
		int i = 0;
		if(curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			LexicoCounting(n, curr*10 + i, ll);
		}
	}
	

}
