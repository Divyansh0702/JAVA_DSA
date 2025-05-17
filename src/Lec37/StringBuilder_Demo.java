package Lec37;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
//		StringBuilder sb = new StringBuilder("Hello"); //capacity -> 16 + 5 = 22
		System.out.println(sb.capacity());
		
		sb.append(1);
		sb.append(2);
		sb.append(true);
		sb.append('a');
		System.out.println(sb);
		sb.append("hello");
		sb.append("okay");
		System.out.println(sb.length());
		sb.append('a');
		System.out.println(sb);
		
		System.out.println(sb.capacity()); //2*old_capacity + 2
		System.out.println(sb.charAt(1));
		System.out.println(sb.substring(1));
		System.out.println(sb.substring(1, 3));
		System.out.println(sb.reverse());
		
		String s = sb.toString(); //convert string builder to string 
		StringBuilder sb1 = new StringBuilder(s); // String to string builder
		
	}

}
