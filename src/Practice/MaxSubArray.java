package Practice;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,-5,4,1,3,-7};
		System.out.println(Max_Sub_Arr(arr));
	}
	
	public static int Max_Sub_Arr(int[] arr) {
		int temp = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			temp = Math.max(sum, temp);
			if(sum < 0) {
				sum = 0;
			}
		}
		return temp; 
	}

}
