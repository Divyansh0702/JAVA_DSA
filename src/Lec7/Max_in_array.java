package Lec7;

public class Max_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
		
		System.out.println(max(arr));
		System.out.println(max1(arr));	
	}
	
//	MAX
	public static int max(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
//	MAX1
	public static int max1(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			max = Math.max(arr[i], max);
		}
		return max;
	}
}
