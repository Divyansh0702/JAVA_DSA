package Assignment_3;

import java.util.*;

public class Largest_Subarray_with_Sum_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9, -3, 3, -1, 6, -5} ;
		System.out.println(LargestSubarray(nums));
		System.out.println(LargestSubarray2(nums));
	}
	
	public static int LargestSubarray(int[] nums) {
		int res = 0;
		for(int i = 0; i < nums.length; i++) {
			int sum = nums[i];
			for(int j = i + 1; j < nums.length; j++) {
				sum += nums[j];
				
				if(sum == 0) {
					res = Math.max(res, j - i + 1);
				}
			}
		}
		return res;
	}
	
	public static int LargestSubarray2(int[] nums) {
		int len = 0, prefixSum = 0;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			prefixSum += nums[i];
			
			if(prefixSum == 0) {
				len = Math.max(len, i + 1);
			}
			else if(map.containsKey(prefixSum)) {
				len = Math.max(len, i - map.get(prefixSum));
			}
			else {
				map.put(prefixSum, i);
			}
		}
		
		return len;
	}

}
