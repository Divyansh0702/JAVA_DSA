package Lec7;

public class Array_Swap_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40};
		int[] other = {100, 200, 300, 400};

		System.out.println(arr[0]+" "+other[0]);
		Swap(arr, other);
		System.out.println(arr[0]+" "+other[0]);
	}
	public static void Swap(int[] arr, int[] other) {
		int[] temp = arr;
		arr = other;
		other = temp;
	}
}
