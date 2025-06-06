package Practice;

public class Trap_Rain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,2,0,3,2,5};
		System.out.println(Trap(arr));
		
	}
	public static int Trap(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		left[0] = arr[0];
		for(int i=1; i<n; i++) {
			left[i] = Math.max(left[i-1], arr[i]);
		}
		
		int[] right = new int[n];
		right[n-1] = arr[n-1];
		for(int i=n-2; i>=0; i--) {
			right[i] = Math.max(right[i+1], arr[i]);
		}
		
		int water = 0;
		for(int i=0; i<n; i++) {
			water += Math.min(left[i], right[i]) - arr[i];
		}
		return water;
	}

}
