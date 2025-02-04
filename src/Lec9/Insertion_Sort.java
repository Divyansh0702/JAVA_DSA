package Lec9;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {2,3,4,5,6,8,9,4};
		int[] arr = {2,3,9,4,4,5,6,8};
		InsertionSort(arr);
//		Insert_Element(arr, arr.length-1);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void InsertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			Insert_Last_Element(arr, i);
		}
	}
	
	public static void Insert_Last_Element(int[] arr, int i) {
		int v = arr[i];
		int j = i-1;
		while(j>=0 && arr[j] > v) {
			arr[j+1] = arr[j];
			arr[j] = v;
			j--;
		}
//	Index number last element j+1	
	}
}
