package Lec24;

public class Student {
	String name;
	int age;
	
	public void Introduction() {
		SayMentorName();
		System.out.println("My name is " + name + " and age is " + age);
	}
	
	public void SayHi(String name) {
		System.out.println(this.name + " says hi to " + name);
	}
	
	public static void SayMentorName(){
		System.out.println("Mentor is Monu Bhaiya");
	}
	
	static {
		System.out.println("I am in Student.java");
	}
}
