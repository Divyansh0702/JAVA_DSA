package Lec24;

public class StudentClient {
	
	public static void main(String[] args) {
		System.out.println("HELLO!");
		
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		
		s.name = "Divyansh";
		s.age = 20;
		System.out.println(s.name);
		System.out.println(s.age);
		s.Introduction();
		
		Student s1 = new Student();
		s1.name = "Guchhu";
		s1.age = 19;
		System.out.println(s1.name);
		System.out.println(s1.age);
		s1.Introduction();
		
		s1.SayHi("Diku");
		
		Student.SayMentorName();
		
	}
	
	static {
		System.out.println("I am in StudentClient.java");
	}

}
