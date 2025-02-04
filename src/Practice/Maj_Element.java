package Practice;

public class Maj_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,1,1,1,2,2};
		System.out.println(MajElem(arr));
		
	}
	public static int MajElem(int[] arr) {
		int m = arr[0];
		int vote = 1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == m) {
				vote++;
			}
			else {
				vote--;
				if(vote == 0) {
					m = arr[i];
					vote = 1;
				}
			}
		}
		return m;
	}
}
