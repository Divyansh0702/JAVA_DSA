package Lec7;

public class Rev_in_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,9,8,1,3,7};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		RevRange(arr, 3, 6);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
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
