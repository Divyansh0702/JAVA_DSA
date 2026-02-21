package Assignment_3;

public class Largest_Subarray_with_Sum_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9, -3, 3, -1, 6, -5} ;
		System.out.println(LargestSubarray(nums));
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

}
