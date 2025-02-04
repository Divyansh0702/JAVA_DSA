package Lec1;

public class max_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 50;
		int y = 180;
		int z = 200;
		if (x >= y && x >= z) {
			System.out.println(x);
		}else if(y >= z) {
			System.out.println(y);
		}else {
			System.out.println(z);
		}
	}

}
