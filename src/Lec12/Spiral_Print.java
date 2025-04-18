package Lec12;

public class Spiral_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } };
		print(arr);
	}
	public static void print(int[][] arr) {
//		1st Boundary
		int minr = 0, minc = 0, maxr = arr.length-1, maxc = arr[0].length-1;
		int total_elements = arr.length * arr[0].length;
		int c = 0;
		while(c < total_elements) {
			for (int i = minc; i <= maxc && c < total_elements; i++) {
				System.out.print(arr[minr][i]+" ");
				c++;
			}
			minr++;
			
//			2nd Boundary		
			for (int i = minr; i <= maxr && c < total_elements; i++) {
				System.out.print(arr[i][maxc]+" ");
				c++;				
			}
			maxc--;

//			3rd Boundary
			for (int i = maxc; i >= minc && c < total_elements; i--) {
				System.out.print(arr[maxr][i]+" ");
				c++;
			}
			maxr--;
			
//			4th Boundary	
			for (int i = maxr; i >= minr && c < total_elements; i--) {
				System.out.print(arr[i][minc]+" ");
				c++;				
			}
			minc++;
		}
	}
}
