package LeetCode;

public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,6,4,8,7,6,3,2,2};
		Permutation(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void Permutation(int[] arr) {
		int p = -1, q = -1;
		
// Finding p
		for(int i = arr.length-2; i>=0; i--) {
			if(arr[i] < arr[i+1]) {
				p = i;
				break;
			}	
		}
		
// If p does not get any value(p=0) then we will reverse the given array
		if(p == -1) {
// Reverse Array
			RevRange(arr, 0, arr.length-1); 
			return;
		}
		
// Finding q
		for(int i = arr.length-1; i>p; i--) {
			if(arr[i] > arr[p]) {
				q = i;
				break;
			}
		}
// Swapping p and q
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
// Now the reversing the whole array after p to find just greater permutation
		RevRange(arr, p+1, arr.length-1);
	}
	
	public static void RevRange(int[] arr, int i, int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
