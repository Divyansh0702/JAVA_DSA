package Lec14;
import java.util.*;

public class Array_List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll);
		ll.add(10); //O(1)
		System.out.println(ll.size());
		
		ll.add(1);
		ll.add(10);
		ll.add(-8);
		System.out.println(ll.size());
		System.out.println(ll);
		
		ll.add(1, 11);//O(n)
		System.out.println(ll);
		System.out.println(ll.size());
		
//		get
		System.out.println(ll.get(3)); //O(1)
//		remove
		System.out.println(ll.remove(3)); //O()
		System.out.println(ll);
//		update
		ll.set(1,  -20);
		System.out.println(ll);
		
//		ll.sort();
//		System.out.println(ll);
//		
//		ll.reverse();
//		System.out.println(ll);
		
		
	}

}
