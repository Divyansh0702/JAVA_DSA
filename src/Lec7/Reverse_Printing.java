package Lec7;

public class Reverse_Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
		rev_display(arr);
	}
	public static void rev_display(int[] arr) {
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
