package Lec1;

public class Lottery {
	public static void main(String[] args) {
		int n = 101;
		if (n >= 1200 && n <= 1400) {
			System.out.println("Kurkure");
			if (n >= 1200 && n <= 1300) {
				System.out.println("Red Kurkure");
			}else if(n >= 1301 && n <= 1400) {
				System.out.println("Kurkure");
			}
		}else if (n >= 250 && n <= 300) {
			System.out.println("Mac");
			if (n >= 250 && n <= 290) {
				System.out.println("M1");
			}else if(n >= 291 && n <= 300) {
				System.out.println("M2");
			}
		}else if (n >= 100 && n <= 200) {
			System.out.println("Car");
			if (n >= 100 && n <= 130) {
				System.out.println("Thar");
			}else if (n >= 131 && n <= 250) {
				System.out.println("Creta");
			}
		}else if (n >= 50 && n <= 80){
			if (n >= 50 && n <= 75) {
				System.out.println("Hero");
			}else if (n >= 76 && n <= 80 ) {
				System.out.println("Hero AI");
			}
			System.out.println("Cycle");
		}else if (n >= 15 && n <= 20) {
			System.out.println("Bike");
			if (n >= 15 && n<=18) {
				System.out.println("Splendor");
			}else if (n >=19 && n <= 20) {
				System.out.println("Hero");
			}
		}else {
			System.out.println("Happy Birthday");
		}
	}
}
