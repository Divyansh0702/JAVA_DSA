package Lec7;

public class Array_Swap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 3, 2, 1, 7};
//		int[] arr = new int[]{5, 3, 2, 1, 7};
		System.out.println(arr[0]+" "+arr[1]);
		Swap(arr, 0, 1);
		System.out.println(arr[0]+" "+arr[1]);
	}
	public static void Swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
