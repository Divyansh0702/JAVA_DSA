package Assignment_3;

public class Stocks_Buy_Sells_Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100, 180, 260, 310, 40, 535, 695, 20, 800, 900, 1};
		
		int res = 0, ans = 0, min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(min < arr[i]) {
				ans = Math.max(ans, arr[i] - min);
				if(i == arr.length - 1) {
					res += ans;
				}
			}
			else {
				res += ans;
				min = arr[i];
				ans = 0;
			}
		}
		
		System.out.println(res);
	}

}
