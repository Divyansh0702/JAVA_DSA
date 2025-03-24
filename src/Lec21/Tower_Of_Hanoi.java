package Lec21;

public class Tower_Of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TOH(3, "A", "C", "B");
		
	}
	public static void TOH(int n, String src, String hlp, String des) {
		if(n == 0) {
			return;
		}
		
		TOH(n-1, src, des, hlp);
		System.out.println("Move " + n + "th disk from " + src + " to " + des);
		TOH(n-1, hlp, src, des);
	}

}
