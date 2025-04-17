package Assignment_3;

public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8, -8, 9, -9, 10, -11, 12};
		
		System.out.println(maxCircSum(nums));
	}
	
	public static int maxCircSum(int[] nums) {
		int sum = 0, ans = Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			i = (i+1) % nums.length;
			
			sum += nums[i];
			ans = Math.max(sum, ans);
			if(sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}

}
