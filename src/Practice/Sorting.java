package Practice;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 5, 3, 2, 1};
//		int[] arr = {2,3,9,4,4,5,6,8};
//		BubbleSort(arr);
//		SelectionSort(arr);
		InsertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void InsertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			InsLstElem(arr, i);
		}
	}
	public static void InsLstElem(int[] arr, int i) {
		int temp = arr[i];
		int j = i-1;
		while(j>=0 && arr[j] > temp) {
			arr[j+1] = arr[j];
			arr[j] = temp;
			j--;
		}
	}
	
	
	public static void SelectionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int index = MinElem(arr, i);
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		
	}
	public static int MinElem(int[] arr, int index) {
		int min = index;
		for(int i=index+1; i<arr.length; i++) {
			if(arr[min] > arr[i]) {
				min = i;
			}
		}
		return min;
	}
	
	
	public static void BubbleSort(int[] arr) {
		for(int turn=1; turn<arr.length; turn++) {
			for(int i=0; i<arr.length - turn; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}

}
