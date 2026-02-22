package Assignment_3;

import java.util.*;

public class Count_the_number_of_subarrays_with_given_XOR_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4, 2, 2, 6, 4} ;
		System.out.println(countSubarrays(nums, 6));
		System.out.println(countSubarrays2(nums, 6));
	}
	
	public static int countSubarrays(int[] nums, int k) {
		int n = nums.length;
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			int xor = 0;
			
			for(int j = i; j < n; j++) {
				xor ^= nums[j];
				if(xor == k) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}
	
	public static int countSubarrays2(int[] nums, int k) {
		int n = nums.length;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int prefixXor = 0, cnt = 0;
		
		map.put(0, 1);
		
		for(int i = 0; i < n; i++) {
			prefixXor ^= nums[i];
			
			if(map.containsKey(prefixXor ^ k)) {
				cnt += map.get(prefixXor ^ k);
			}
			
			map.put(prefixXor, map.getOrDefault(prefixXor, 0) + 1);
		}
		
		return cnt;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
