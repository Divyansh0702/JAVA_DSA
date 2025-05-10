package Lec34;

// Manager
public interface Stack_Interface {
	public void push(int item);
	
	public int pop();
	
	public int peek();
	
	int x = 90; // by default, public, static, final

//	In JAVA 8
	static void f1() {
		
	}
	
	default void f2() {
		
	}
	
//	In JAVA 9
	private void name() {
		
	}
}
