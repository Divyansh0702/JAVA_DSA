package Practice;

public class Cycle_Removal {
	
	private class Node{
		int val;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	// O(1)
	public void addfirst(int item) {
		Node nn = new Node();
		nn.val = item;
		
		if(size == 0) {
			head = nn;
			tail = nn;
			size++;
		}
		else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	// O(1)
	public void addlast(int item) {
		if(size == 0) {
			addfirst(item);
		}
		else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}
	
	// O(N)
		private Node getNode(int k)  throws Exception {
			if((k < 0) || (k >= size)){
				throw new Exception("bklol k range m nhi hai");
			}
			
			Node temp = head;
			for (int i = 0; i < k; i++) {
				temp = temp.next;
			}
			return temp;
		}
		
		public void Display() {
			Node temp = head;
			while(temp != null){
				System.out.print(temp.val + "-->");
				temp = temp.next;
			}
			System.out.println(".");
		}
		
		public Node hasCycle() {
			Node slow = head;
			Node fast = head;
			while(fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
				if(slow == fast) {
					return slow;
				}
			}
			return null;
		}
		
		public void CreateCycle() throws Exception {
			tail.next = getNode(2); 
		}
		
		
		public void CycleRemoval1() {
			Node meet = hasCycle();
			
			if(meet == null) {
				return;
			}
			
			Node start = head;
			while(start != null) {
				Node temp = meet;
				while(temp.next != meet) {
					if(temp.next == start) {
						temp.next = null;
						return;
					}
					temp = temp.next;
				}
				start = start.next;
			}	
		}
		
		
		public void CycleRemoval2() {
			Node meet = hasCycle();
			if(meet == null) {
				return;
			}
			
			Node temp = meet;
			int count = 1;
			while(temp.next != meet) {
				count++;
				temp = temp.next;
			}
			
			Node fast = head;
			for(int i = 0; i < count; i++) {
				fast = fast.next;
			}
			
			Node slow = head;
			while(slow.next != fast.next) {
				slow = slow.next;
				fast = fast.next;
			}
			fast.next = null;
			
		}
		
		public static void main(String[] args) throws Exception{
			Cycle_Removal cl = new Cycle_Removal();
			cl.addlast(1);
			cl.addlast(2);
			cl.addlast(3);
			cl.addlast(4);
			cl.addlast(5);
			cl.addlast(6);
			cl.addlast(7);
			cl.addlast(8);
			cl.Display();
			
			System.out.println(cl.hasCycle());
			
			cl.CreateCycle();
			cl.CycleRemoval2();
			cl.Display();
			
		}
		
}
