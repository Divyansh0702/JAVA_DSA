package Assignment_3;

import java.util.Scanner;

public class Maximum_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			
			int nums1[] = new int[n];
			for (int i = 0; i < nums1.length; i++) {
				nums1[i] = sc.nextInt();
			}
			
			System.out.println(MaxSum(nums1));
			System.out.println(Kadanes(nums1));
		}	
	}
	
	public static int MaxSum(int[] nums1) {
		int ans = 0;
		for (int i = 0; i < nums1.length; i++) {
			int sum = 0;
			for (int j = i; j < nums1.length; j++) {
				sum += nums1[j];
				ans = Math.max(ans, sum);
			}
		}
		return ans;
	}
	
	public static int Kadanes(int[] nums1) {
		int sum = 0, ans = Integer.MIN_VALUE;
		for (int i = 0; i < nums1.length; i++) {
			sum += nums1[i];
			ans = Math.max(ans, sum);
			if(sum < 0) {
				sum = 0;
				
			}
		}
		return ans;
	}

}












