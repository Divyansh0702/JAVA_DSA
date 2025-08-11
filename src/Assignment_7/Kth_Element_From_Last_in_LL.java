package Assignment_7;

import java.util.*;

public class Kth_Element_From_Last_in_LL {

	static class Node{
		int val;
		Node next;
		
		Node(int val){
			this.val = val;
		}
	}
	
	public static Node reverse(Node prev, Node curr) {
		if(curr == null) {
			return prev;
		}
		Node temp = reverse(curr ,curr.next);
		curr.next = prev;
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int first = sc.nextInt();
		if(first == -1) {
			return;
		}
		
		Node head = new Node(first);
		Node curr = head;
		
		while(true) {
			int i = sc.nextInt();
			if(i == -1) {
				break;
			}
			curr.next = new Node(i);
			curr = curr.next;
		}
		
		int k = sc.nextInt();
		
		head = reverse(null, head);
		
		curr = head;
		for (int i = 1; i < k; i++) {
			curr = curr.next;
			if(curr == null) {
				return;
			}
		}
		
		System.out.println(curr.val);
	
	}

}
