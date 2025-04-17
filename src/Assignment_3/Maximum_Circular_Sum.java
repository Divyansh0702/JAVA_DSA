package Assignment_3;

public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8, -8, 9, -9, 10, -11, 12};
		
		System.out.println(maxCircSum(nums));
	}
	
	public static int maxCircSum(int[] nums) {
		int totalsum = 0, minsum = 0, minkadane = Integer.MAX_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			totalsum += nums[i];
			
			minsum += nums[i];
			minkadane = Math.min(minsum, minkadane);
			
		}
		
		return totalsum - minkadane;
	}

}
