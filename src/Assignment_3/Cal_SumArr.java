package Assignment_3;

import java.util.Scanner;

public class Cal_SumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int mod = (int)(1e9 + 7);
		
		int[] resArr = arr.clone(); 
				
		int q = sc.nextInt();
		while(q-- > 0) {
			int opr = sc.nextInt();
			resArr = CalSum(resArr, opr);
		}
		
		System.out.println(finalSum(resArr, mod));
		
	}
	
	public static int[] CalSum(int[] arr, int opr) {
		int newArr[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int prevInd = ( i - opr + arr.length ) % arr.length;
			newArr[i] = arr[i] + arr[prevInd];
		}
		return newArr;
	}
	
	public static int finalSum(int[] resArr, int mod) {
		int sum = 0;
		for (int i = 0; i < resArr.length; i++) {
			sum += resArr[i];
		}
		return sum % mod;
		
	}

}
