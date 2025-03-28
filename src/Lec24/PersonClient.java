package Lec24;

public class PersonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Divyansh", 20);
//		System.out.println(p.name);
//		System.out.println(p.age);
//		
//		p.age = 21;
//		System.out.println(p.age);
		
		p.setName("Guchhu");
		System.out.println(p.getName());
		
		p.setAge(19);
		System.out.println(p.getAge());
	}

}
