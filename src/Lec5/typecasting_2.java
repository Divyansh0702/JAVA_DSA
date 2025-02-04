package Lec5;
import java.util.*;

public class typecasting_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		float f = 35.5f; //literal changed to float from double
//		System.out.println(f);
		float f = (float) 35.5; // value type changed to float
		System.out.println(f);
		
		double d = 52.23;
		System.out.println(d);
		
		Scanner sc = new Scanner(System.in);
		f = sc.nextFloat();
		System.out.println(f);
		
		d = sc.nextDouble();
		System.out.println(d);
		
		sc.close();
	}

}
