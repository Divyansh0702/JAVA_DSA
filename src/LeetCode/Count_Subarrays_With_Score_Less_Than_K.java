package LeetCode;

public class Count_Subarrays_With_Score_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,1,4,3,5};
		
		System.out.println(countSubarrays(nums, 10));
	}
	
	public static long countSubarrays(int[] nums, long k) {
		long n = nums.length;
        long cnt = 0;
        long i = 0;
        while(i < n){
            long j = i;
            long sum = 0;
            long length = 1;
            while(j < n){
                sum += nums[(int) j];
                if((sum * length) < k){
                    cnt++;
                    length++;
                    j++;
                }
                else{
                    break;
                }
            }
            i++;
        }

        return cnt;
  
    }

}
