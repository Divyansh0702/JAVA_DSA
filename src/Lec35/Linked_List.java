package Lec35;

public class Linked_List<T> {
	
	private class Node{
		T val;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	// O(1)
	public void addfirst(T item) {
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
	
	public void addlast(T item) {
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
	
	public void addatindex(T item, int k)  throws Exception {
		if(k == 0) {
			addfirst(item);
		}
		else if(k == size) {
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
	
	public int DisplaySize() {
		return size;
	}
	
	public T getfirst() {
		return head.val;
	}
	
	public T getlast() {
		return tail.val;
	}
	
	public T getatindex(int k) throws Exception {
		return getNode(k).val;		
	}

	public T removefirst() {
		Node curr = head;
		if (size == 1) {
			head = null;
			tail = null;
			size = 0;
		} else {
			head = head.next;
			curr.next = null;
			size--;
		}
		return curr.val;
//		Node curr = head;
//		if(size == 0) {
//			return ; // or throws an exception
//		}
//		if(size == 1) {
//			head = null;
//			tail = null;
//		}
//		else {
//			head = curr.next;
//			curr.next = null;	
//		}
//		size--;
//		return curr.val;
	}
	
	public T removelast() throws Exception {
		if (size == 1) {
            return removefirst();
        }
        Node curr = tail;
        tail = getNode(size - 2);
        tail.next = null;
        size--;
        return curr.val;
	}
	
	public T removeatindex(int k) throws Exception{
		if (k == 0) {
            return removefirst(); 
        } 
		else if (k == size - 1) {
            return removelast(); 
        } 
		else {
            Node prev = getNode(k - 1);
            Node curr = prev.next;
            prev.next = curr.next;
            curr.next = null;
            size--;
            return curr.val;
        }
	}
	
	public static void main(String[] args) {
		Linked_List<String> ll = new Linked_List<>();
		ll.addlast("Raj");
		ll.addlast("Amisha");
		ll.addlast("Kaju");
		ll.addlast("Ankit");
		
		ll.Display();
	}
}
