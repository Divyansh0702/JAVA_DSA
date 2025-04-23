package Assignment_3;

import java.util.Scanner;

public class Sum_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] nums1 = new int[n];
		for (int i = 0; i < nums1.length; i++) {  
			nums1[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[] nums2 = new int[m];
		for (int i = 0; i < nums2.length; i++) {  
			nums2[i] = sc.nextInt();
		}
		
		int arr[] = Sum(nums1, nums2);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] Sum(int[] nums1, int[] nums2) {
		int n = nums1.length;
		int m = nums2.length;
		int r = Math.max(n, m);
		
		int res[] = new int [r + 1];
		
		int i = n-1;
		int j = m-1;
		int k = r;
		int carry = 0;
		
		while(i >= 0 || j >= 0 || carry != 0) {
			int digit1 = 0;
			int digit2 = 0;
			
			if(i >= 0) {
				digit1 = nums1[i];
			}
			
			if(j >= 0) {
				digit2 = nums2[j];
			}
			
	
			int sum = digit1 + digit2 + carry;
			res[k] = sum % 10;
			carry = sum / 10;
			i--;
			j--;
			k--;
		}
		
		// if highest place has no carry then
		if(res[0] == 0) {
			int[] finalarr = new int[r];
			System.arraycopy(res, 1, finalarr, 0, r);
			return finalarr;
		}	
		return res;
	}

}
