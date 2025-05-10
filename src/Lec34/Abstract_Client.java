package Lec34;

public class Abstract_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Before JAVA 8		
//		Abstract_Demo ab = new Abstract_Demo();
		Payment_Method ab = new Payment_Method();
		ab.Payment();
		
//  In JAVA 8
		Abstract_Demo ab1 = new Abstract_Demo() {
			
			@Override
			public void Payment() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public int NoOfItem() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		ab1.Payment();
	}

}
