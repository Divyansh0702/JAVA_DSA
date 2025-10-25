package Assignment_5;

import java.util.*;

public class LC_String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		
		char[] ch = s.toCharArray();
		
//		for (int i = 0; i < ch.length; i++) {
//			System.out.print(ch[i] + " ");
//		}
		
		System.out.println();
		System.out.println(Compress(ch));
	}
	
	public static int Compress(char[] ch) {
		int i = 0;
		int write = 0;
		
		while(i < ch.length) {
			char currCh = ch[i];
			
			int j = i + 1;
			while(j < ch.length && currCh == ch[j]) {
				j++;
			}
			
			int count = j - i;

			ch[write++] = currCh;
			
			if(count > 1) {
				String countStr = String.valueOf(count);
				for (int k = 0; k < countStr.length(); k++) {
					ch[write++] = countStr.charAt(k);
				}
			}			
			i = j;
		}
//		
//		for (char c : ch) {
//			System.out.print(c + " ");
//		}
		return write;
		
	}

}
