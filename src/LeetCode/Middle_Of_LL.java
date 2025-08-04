package LeetCode;

public class Middle_Of_LL {

	class Node{
		int val;
		Node next;
		
		Node(int val){
			this.val = val;
		}
		
		Node(int val, Node next){
			this.val = val;
			this.next = next;
		}
	}
	
	static Node head;
	static Node tail;
	static int size; 
	
	
	public void addlast(int item) {
		Node nn = new Node(item);
		if(size == 0) { // addfirst
			head = nn;
			tail = nn;
			size++;
		}
		else {
			tail.next = nn;
			tail = nn;
//			size++;
		}
		
	}
	
	public Node getNode(int k) {
		Node temp = head;
		for(int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public void Display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;			
		}
		System.out.println(".");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Middle_Of_LL ll = new Middle_Of_LL();
		ll.addlast(1);
		ll.Display();

		ll.addlast(2);
		ll.Display();

		ll.addlast(3);
		ll.Display();
		
		ll.addlast(4);
		ll.Display();

		ll.addlast(5);
		ll.Display();

		ll.addlast(6);
		ll.Display();
		
		Node temp = head;
		while(temp != null) {
			size++;
			temp = temp.next;
		}
		int orgSize = size - 1;
		System.out.println(orgSize);
		
		Node middle = ll.getNode(orgSize / 2);		
		System.out.println(middle.val);
		
		Node temp2 = middle;
		while(temp2 != null) {
			System.out.print(temp2.val + "-->");
			temp2 = temp2.next;
		}
		System.out.println(".");
		
	}

}
