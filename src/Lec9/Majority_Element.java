package Lec9;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,1,1,1,2,2};
		System.out.println(MajElem(arr));
	}
	public static int MajElem(int[] arr) {
//		Moore Voting Algorithm
		int e = arr[0];
		int vote = 1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == e) {
				vote++;				
			}
			else {
				vote--;
				if(vote == 0) {
					e = arr[i];
					vote = 1;
				}
			}
		}
		return e;
	}
}
