package Lec1;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 60;
		if (m >= 75) {
			System.out.println("A");
		}else if(m >= 65) {
			System.out.println("B");
		}else if(m >= 55){
			System.out.println("C");	
		}else if(m >= 45) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
