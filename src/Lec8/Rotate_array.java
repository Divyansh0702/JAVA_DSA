package Lec8;

public class Rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		int k = 3;
		Rotate(arr,k);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	public static void Rotate(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		for(int i=1; i<=k; i++) {
			int val = arr[n-1];
			for(int j = n-2; j>=0; j--) {
				arr[j+1] = arr[j];
			}
			arr[0] = val;
		}
 	}
}
