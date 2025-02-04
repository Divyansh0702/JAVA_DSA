package Lec10;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,9,10,15};
		int item = 9;
		System.out.println(BinarySearch(arr, item));
	}
	public static int BinarySearch(int[] arr, int item) {
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid] == item) {
				return mid;
			}
			else if(arr[mid] > item) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
