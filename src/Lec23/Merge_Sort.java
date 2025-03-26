package Lec23;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,5,1,4,3};
		
		int[] ans = Sort(arr, 0, arr.length-1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		
	}
	
	public static int[] Sort(int[] arr, int si, int ei) {
		if(si == ei) {
			int[] bs = new int[1];
			bs[0] = arr[si];
			return bs;
		}
		
		int mid = (si + ei) / 2;
		int[] fa = Sort(arr, si, mid);
		int[] sa = Sort(arr, mid+1, ei);
		
		return Merge(fa, sa);
	}
	
	public static int[] Merge(int[] fa, int[] sa) {
		int[] res = new int[fa.length + sa.length];
		
		int i = 0, j = 0, k = 0;
		while(i < fa.length && j < sa.length) {
			if(fa[i] < sa[j]) {
				res[k] = fa[i];
				i++;
				k++;
			}
			else {
				res[k] = sa[j];
				j++;
				k++;
			}
		}
		
		while(i < fa.length) {
			res[k] = fa[i];
			i++;
			k++;
		}
		
		while(j < sa.length) {
			res[k] = sa[j];
			j++;
			k++;
		}
		
		return res;
	}

}









