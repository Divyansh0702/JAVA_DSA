package Practice;

public class KthRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int n = 143;
		System.out.println(Kth_Root(k, n));
	}
	public static int Kth_Root(int k, int n) {
		int low = 1;
		int high = n;
		int ans = 0;
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(Math.pow(mid, k) <= n) {
				ans = mid;
				low = mid + 1;
			}
			else {
				high = mid-1;
			}
		}
		return ans;
	}

}

