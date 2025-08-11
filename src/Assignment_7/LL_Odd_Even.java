package Assignment_7;

import java.util.*;

public class LL_Odd_Even {

	static class Node{
		int val;
		Node next;
		
		Node(int val){
			this.val = val;
		}
	}
	
	public static void display(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}
	
	public static Node oddEven(Node head) {
		Node odd = new Node(0); // Dummy list for odd elements
		Node even = new Node(0); // Dummy list for even elements
		
		Node oddcurr = odd;
		Node evencurr = even;
		Node temp = head; // original list
		
		while(temp == null || temp.next == null) {
			return head;
		}
		
		while(temp != null) {
			if(temp.val % 2 != 0) {
				oddcurr.next = temp;
				oddcurr = oddcurr.next;
			}
			else{
				evencurr.next = temp;
				evencurr = evencurr.next;
			}
			
			temp = temp.next;
		}
		
		evencurr.next = null; // *** to avoid infinte loop ***
		oddcurr.next = even.next; // merging odd and even lists
			
		return odd.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Node head = new Node(sc.nextInt());
		Node curr = head;
		
		for (int i = 1; i < n; i++) {
			curr.next = new Node(sc.nextInt());
			curr = curr.next;
		}
		
		head = oddEven(head);
		
		display(head);
	}

}
