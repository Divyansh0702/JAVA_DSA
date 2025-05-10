package Lec35;

public class Generics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = {10, 20, 30, 40, 50};
		Display(arr1);
		Character[] arr2 = {'1','2','3','4'};
		Display(arr2);
		String[] arr3 = {"Name", "names"};
		Display(arr3);
	}
	
	public static <T> void Display(T[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static <T> T index(T[] arr) {
		return arr[0];
	}

}
