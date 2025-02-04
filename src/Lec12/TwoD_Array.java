package Lec12;

public class TwoD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[1][0]);
		
		int[][] other = arr; // Just stores the array address, not the data of array
		
		int row = arr.length;
		int col = arr[0].length;
		
		System.out.println(row);
		System.out.println(col);
	}

}
