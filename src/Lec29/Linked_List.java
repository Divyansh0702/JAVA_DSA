package Lec29;

public class Linked_List {
	
	private class Node{
		int val;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
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
	
	public void addlast(int item) {
		if(size == 0) {
			addfirst(item);
		}
		else {
			Node nn = new Node();
			tail.next = nn;
			tail = nn;
			size++;
		}
	}
	
	public void addatindex(int item, int k)  throws Exception {
		if(k == 0) {
			addfirst(item);
		}
		else if(k == size-1) {
			addlast(item);
		}
		else {
			Node prev = getNode(k - 1);
			Node nn = new Node();
			nn.val = item;
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}
	}
	
	private Node getNode(int k)  throws Exception {
		if((k < 0) || (k > size)){
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
	
	public int DisplaySize() {
		return size;
	}
	
	public int getfirst() {
		return head.val;
	}
	
	public int getlast() {
		return tail.val;
	}
	
	public int getatindex(int k) throws Exception {
		return getNode(k).val;		
	}

	public int removefirst() {
		Node curr = head;
		if(size == 1) {
			head = null;
			tail = null;
			size = 0;
		}
		else {
			head = curr.next;
			curr.next = null;
			size--;
		}
		return curr.val;
	}
	
	public int removelast() throws Exception {
		Node curr = tail;
		if(size == 1) {
			removefirst();
		}
		else {
			tail = getNode(size - 2);
			tail.next = null;
			size--;
		}
		return curr.val;
	}
	
	public int removeatindex(int k) throws Exception{
		Node curr = getNode(k);
		if(k == 0) {
			removefirst();
		}
		else if(k == size-1) {
			removelast();
		}
		else {
			Node prev = getNode(k-1);
			prev.next = curr.next;
			curr.next = null;
			size--;
		}
		return curr.val;
	}
}











