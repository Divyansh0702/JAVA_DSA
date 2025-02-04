package Practice;

public class rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		RotateRev(arr, 3);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void Rotate(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		for(int i=0; i<k; i++) {
			int temp = arr[n-1];
			for(int j = n-2; j>=0; j--) {
				arr[j+1] = arr[j];
			}
			arr[0] = temp;
		}
	}
	
	public static void RotateRev(int[] arr, int k) {
		int n = arr.length;
		Reverse(arr, 0, n-k-1);
		Reverse(arr, n-k, n-1);
		Reverse(arr, 0, n-1);
	}
	
	public static void Reverse(int[] arr, int i, int j) {
		while(i<j) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
		}
	}
}
