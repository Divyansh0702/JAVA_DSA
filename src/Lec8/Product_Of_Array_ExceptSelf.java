package Lec8;

public class Product_Of_Array_ExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,6};
		int[] res = Product(arr);
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
	
	public static int[] Product(int[] arr) {
		int n = arr.length;
		
		int [] left = new int[n];
		left[0] = 1;
		for(int i=1; i<n; i++) {
			left[i] = left[i-1]*arr[i-1];
		}
		
		int[] right = new int[n];
		right[n-1] = 1;
		for(int i = n-2; i>=0; i--) {
			right[i] = right[i+1]*arr[i+1];
		}
		
		for(int i=0; i<n; i++) {
			left[i] = left[i]*right[i];
		}
		return left;
	}

}
