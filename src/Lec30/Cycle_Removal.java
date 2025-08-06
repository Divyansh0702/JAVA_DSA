package Lec30;

public class Cycle_Removal {

	private class Node {
		int val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void addLast(int item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	private Node getNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void CreateCycle() {
		tail.next = getNode(2);
	}
	
	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}
	
	public Node hasCycle() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }
        }
        return null;
    }

//	O(n^2)
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
	
//	O(N)
	public void CycleRemoval2() {
		Node meet = hasCycle();
		if(meet == null) {
			return;
		}
		// Length of cycle
		int c = 1;
		Node temp = meet;
		while(temp.next != meet) {
			c++;
			temp = temp.next;
		}
		
		// Fast will move to m(c) distance ahead
		Node fast = head;
		for (int i = 0; i < c; i++) {
			fast = fast.next;
		}
		
//		Removal
		Node slow = head;
		while(slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}
	
	
	public void FloyedCycleRemoval() {
		Node meet = hasCycle();
		if(meet == null) {
			return;
		}
		
		Node fast = meet;
		
		Node slow = head;
		while(slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}
	

	public static void main(String[] args) throws Exception {
		Cycle_Removal cl = new Cycle_Removal();
		cl.addLast(1);
		cl.addLast(2);
		cl.addLast(3);
		cl.addLast(4);
		cl.addLast(5);
		cl.addLast(6);
		cl.addLast(7);
		cl.addLast(8);
		cl.CreateCycle();
		cl.CycleRemoval1();
		cl.Display();
	}

}
