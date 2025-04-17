package Assignment_3;

import java.util.Scanner;

public class Maximum_Score {
	
	private static final int mod = 1000000007;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int nums1[] = new int[n];
			for (int i = 0; i < nums1.length; i++) {
				nums1[i] = sc.nextInt();
			}
			
			int nums2[] = new int[m];
			for (int i = 0; i < nums2.length; i++) {
				nums2[i] = sc.nextInt();
			}
			
			System.out.println(MaxScore(nums1, nums2, n, m));
		}
	}
	
	public static int MaxScore(int[] nums1, int[] nums2, int n, int m) {
		int i = 0, j = 0;
		long s1 = 0, s2 = 0, ans = 0;
		
		while(i < n && j < m) {
			if(nums1[i] < nums2[j]) {
				s1 += nums1[i++];
			}
			else if(nums2[j] < nums1[i]) {
				s2 += nums2[j++];
			}
			else {
				ans += nums1[i] + Math.max(s1, s2);
				s1 = 0;
				s2 = 0;
				i++;
				j++;
			}
		}
		
		while(i < n) {
			s1 += nums1[i++];
		}
		
		while(j < m) {
			s2 += nums2[j++];
		}
		
		ans = (ans + Math.max(s1, s2)) % mod;
		
		
		return (int)ans;
		
	}

}









