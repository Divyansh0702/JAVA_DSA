package Assignment_4;

import java.util.Scanner;

public class Piyush_Magical_Park {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		
		char[][] arr = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.next().charAt(0);
			}
		}
		
		int escape = isEscaped(arr, n, m, k, s);
		if(escape == -1) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
			System.out.println(escape);
		}
	}
	
	public static int isEscaped(char[][] arr, int n, int m, int k, int s) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(s < k) {
					return -1;
				}
				
				if(arr[i][j] == '.') {
					s -= 2;
				}
				else if(arr[i][j] == '*') {
					s += 5;
				}
				else if(arr[i][j] == '#'){
					break;
				}
				
				if(j != m - 1) {
					s--;					
				}
			}
		}
		return s;
	}

}
