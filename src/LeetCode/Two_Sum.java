package LeetCode;

import java.util.Scanner;

public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		int t = sc.nextInt();	
		int arr[] = TwoSum(nums, t);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] TwoSum(int[] nums, int t) {
		int i = 0;
		int j = nums.length-1;
		int op[] = new int[2];
		while(i < j) {
			int sum = nums[i] + nums[j];
			if(sum == t) {
				op[0] = i;			
				op[1] = j;			
				i++;
				j--;
			}
			else if(sum > t){
				j--;
			}
			else {
				i++;
			}
		}
		return op;
	}
}
