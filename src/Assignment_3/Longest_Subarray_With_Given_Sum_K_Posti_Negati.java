package Assignment_3;

import java.util.*;

public class Longest_Subarray_With_Given_Sum_K_Posti_Negati {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = {-1, 1, 1};
		int[] nums = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
		System.out.println(LongestSubarray(nums, 3));
	}
	
	public static int LongestSubarray(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int prefixSum = 0, len = 0;
		for(int i = 0; i < nums.length; i++) {
			prefixSum += nums[i];
			
			if(prefixSum == k) {
				len = Math.max(len, i + 1);
			}
			
			else if(map.containsKey(prefixSum - k)) {
				len = Math.max(len, i - map.get(prefixSum - k));
			}

			map.put(prefixSum, i);
		}
		return len;
	}

}
