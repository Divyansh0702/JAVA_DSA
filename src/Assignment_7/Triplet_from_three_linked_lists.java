package Assignment_7;

import java.util.*;

public class Triplet_from_three_linked_lists {

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
	
	public static int[] toArray(Node head) {
		List<Integer> arr = new ArrayList<Integer>();
		
		Node temp = head;
		while(temp != null) {
			arr.add(temp.val);
			temp = temp.next;
		}
		return arr.stream().mapToInt(i -> i).toArray();
	}
	
	public static Node toLinkedList(int[] arr) {
		if(arr.length == 0) {
			return null;
		}
	
		Node head = new Node(arr[0]);
		Node temp = head;
		for (int i = 1; i < arr.length; i++) {
			temp.next = new Node(arr[i]);
			temp = temp.next;
		}
		
		return head;
	}
	
//	Sorting arr2 & arr3 : O(m logm + k logk)
//	Two pointer search: O(m + k)
//	Total: O(m logm + k logk + n x (m + k))
//	Space: O(m + k) for arrays
	
//	Using Arrays
//	public static void triplet(Node head1, Node head2, Node head3, int target) {
//		int[] arr2 = toArray(head2);
//		int[] arr3 = toArray(head3);
//		
//		// Sorting
//		Arrays.sort(arr2); // O(m logm)
//		Arrays.sort(arr3); // O(k logk)
//		
//		Node temp1 = head1;
//		while(temp1 != null) { // O(n)
//			int needed = target - temp1.val;
//			
//			// Two pointers
//			int left = 0;
//			int right = arr3.length - 1;
//			while(left < arr2.length && right >= 0) { // O(m + k)
//				int sum23 = arr2[left] + arr3[right];
//				if(sum23 == needed) {
//					System.out.println(temp1.val + " " + arr2[left] + " " + arr3[right]);
//					return;
//				}
//				else if(sum23 < needed) {
//					left++;
//				}
//				else {
//					right--;
//				}
//			}
//			temp1 = temp1.next;
//		}
//	}
	
//	Using HashSet
	public static void triplet(Node head1, Node head2, Node head3, int target) {
		Set<Integer> set = new HashSet<Integer>();
		
		Node temp = head3;
		while(temp != null) {
			set.add(temp.val);
			temp = temp.next;
		}
		
		Node temp1 = head1;
		while(temp1 != null) {
			
			Node temp2 = head2;
			while(temp2 != null) {
				int needed = target - (temp1.val + temp2.val);
				if(set.contains(needed)) {
					System.out.println(temp1.val + " " + temp2.val + " " + needed);
					return;
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
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
		
		Node head3 = new Node(sc.nextInt());
		Node temp3 = head3;
		
		for(int i = 1; i < n3; i++) {
			temp3.next = new Node(sc.nextInt());
			temp3 = temp3.next;
		}
		
		int target = sc.nextInt();
		
		triplet(head1, head2, head3, target);
		
	}
	
//	We can also do it by using HashSet -> O(n x m + k)

}
