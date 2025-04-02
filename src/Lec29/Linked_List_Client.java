package Lec29;

public class Linked_List_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Linked_List ll = new Linked_List();
		ll.addfirst(10);
		ll.addfirst(20);
		ll.addfirst(30);
		ll.addfirst(40);
		ll.Display();
		
		ll.addatindex(100, 3);
		ll.Display();
		
		System.out.println(ll.getfirst());
		System.out.println(ll.getlast());
		System.out.println(ll.getatindex(2));
		
		System.out.println(ll.DisplaySize());
		
		System.out.println(ll.removefirst());
		System.out.println(ll.removelast());
		System.out.println(ll.removeatindex(1));
		
		ll.Display();
	}

}
