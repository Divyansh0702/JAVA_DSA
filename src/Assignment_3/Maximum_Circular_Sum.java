package Assignment_3;

public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8, -8, 9, -9, 10, -11, 12};
		
		System.out.println(maxCircSum(nums));
	}
	
	public static int maxCircSum(int[] nums) {
		int linear_sum = Kadanes(nums);
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			nums[i] = nums[i] * -1;
		}
		int mid = Kadanes(nums);
		int circular_sum = sum + mid;
		
		if(circular_sum == 0) {
			return linear_sum;
		}
		
		return Math.max(linear_sum, circular_sum);
	}
	
	public static int Kadanes(int[] nums) {
		int sum = 0, ans = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			ans = Math.max(ans, sum);
			if(sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}

}
