package Lec25;

public class Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		s.Display();

		System.out.println();
		System.out.println(s.pop());
		
		s.Display();
		
		System.out.println();
		System.out.println(s.pop());
		s.Display();
		
		System.out.println();
		System.out.println(s.peek());
		s.Display();
		
		System.out.println(s.isEmpty());		
	}

}
