package Assignment_3;

public class Longest_Subarray_With_Given_Sum_K_Positives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10, 5, 2, 7, 1, 9};
		System.out.println(LongestSubarray(nums, 15));
	}
	
//	TC - O(N^2) SC - O(1)
	public static int LongestSubarray(int[] nums, int k) {
		int res = 0;
		for(int i = 0; i < nums.length; i++) {
			int sum = 0;
			for(int j = i; j < nums.length; j++) {
				sum += nums[j];
				
				if(sum == k) {
					res = Math.max(res, j - i + 1);
					break;
				}
			}
		}
		return res;
	}

//	Sliding Window 
//	TC - O(2N) SC - O(1)
	public static int LongestSubarray2(int[] nums, int k) {
		int left = 0, right = 0;
		int sum = 0, res = 0;
		
		while(right < nums.length) {
			sum += nums[right];
			
			while(left <= right && sum > k) {
				sum -= nums[left];
				left++;
			}
			
			if(sum == k) {
				res = Math.max(res, right - left + 1);
			}
		}
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
