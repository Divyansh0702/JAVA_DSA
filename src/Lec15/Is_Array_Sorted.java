package Lec15;

public class Is_Array_Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,8,9};
		System.out.println(isSorted(arr, 1));
	}
	
	public static boolean isSorted(int[] arr, int i) {
		if(i == arr.length) {
			return true;
		}
		if(arr[i] < arr[i-1]) {
			return false;
		}
		return isSorted(arr, i+1); 
	}
}
