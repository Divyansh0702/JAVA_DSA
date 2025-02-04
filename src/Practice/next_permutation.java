package Practice;

public class next_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,6,4,8,7,6,3,2,2};
		nxtp(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void nxtp(int[] arr) {
		int p = -1, q = -1;
		for(int i = arr.length-2; i>=0; i--) {
			if(arr[i] < arr[i+1]) {
				p = i;
				break;
			}
		}
		
		if(p == -1) {
			Reverse(arr, 0, arr.length-1);
			return; 
			}
		
		for(int i = arr.length-1; i>=0; i--) {
			if(arr[i] > arr[p]) {
				q = i;
				break;
			}
		}
		
		Swap(arr, p, q);
		Reverse(arr, p+1, arr.length-1);

		}
	
	public static void Reverse(int[] arr, int i, int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	
	public static void Swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
}
