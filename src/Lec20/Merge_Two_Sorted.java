package Lec20;

public class Merge_Two_Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2,3,5,7,9};
		int[] arr2 = {1,2,5,7,9,11,13,15,18};
		
		int[] resArr = Merge(arr1, arr2);
		
		for (int i = 0; i < resArr.length; i++) {
			System.out.print(resArr[i] + " ");
		}
	}
	
	public static int[] Merge(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int res[] = new int[n + m];
		
		int i = 0, j = 0, k = 0;
		
		while(i < n && j < m) {
			if(arr1[i] < arr2[j]) {
				res[k] = arr1[i];
				i++;
				k++;
			}
			else {
				res[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		//arr1 elements left
		while(i < n) {
			res[k] = arr1[i];
			i++;
			k++;
		}
		
		//arr2 elements left
		while(j < m) {
			res[k] = arr2[j];
			j++;
			k++;
		}
		
		return res;
	}

}
