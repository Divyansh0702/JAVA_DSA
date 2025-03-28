package Lec24;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
//		Default constructor used by java automatically
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) { //throws Exception
//		if(age < 0) {
//			throw new Exception("Bklol age -ve nhi hota hai");
//		}
//		this.age = age;
		
//		using try, catch, finally to handle the exception
		try {
			if(age < 0) {
				throw new Exception("Bklol age -ve nhi hota hai");
			}
			this.age = age;
			
		} catch(Exception e){
			e.printStackTrace();
			
		} finally {
			System.out.println("You have entered a valid age");
		}
		
	}
	
	public int getAge() {
		return age;
	}
	
}
