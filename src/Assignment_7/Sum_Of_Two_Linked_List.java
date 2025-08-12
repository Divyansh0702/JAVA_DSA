package Assignment_7;

import java.util.*;

public class Sum_Of_Two_Linked_List {

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
		System.out.println();
	}
	
	public static int sumList(Node temp1, Node temp2) {
		if(temp1.next == null || temp2.next == null) {
			return temp1.val + temp2.val;
		}
		temp1 = temp1.next;
		temp2 = temp2.next; 
		int sum = sumList(temp1, temp2);
		
		return temp1.val + temp2.val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		Node head1 = new Node(sc.nextInt());
		Node temp1 = head1;
		
		for(int i = 1; i < n1; i++) {
			temp1.next = new Node(sc.nextInt());
			temp1 = temp1.next;
		}
		
		Node head2 = new Node(sc.nextInt());
		Node temp2 = head2;
		
		for(int i = 1; i < n2; i++) {
			temp2.next = new Node(sc.nextInt());
			temp2 = temp2.next;
		}
		
		display(head1);
		display(head2);
		
		temp1 = head1;
		temp2 = head2;
		System.out.println(sumList(temp1, temp2));
	
	}

}
