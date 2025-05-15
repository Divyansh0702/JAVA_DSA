package Lec36;

import java.util.*;

public class Heap {

	private ArrayList<Integer> ll = new ArrayList<>();
	
	public void add(int item) {
		ll.add(item);
		Upheapify(ll.size() - 1);
	}
	
	private void Upheapify(int ci) {
		int pi = (ci - 1) / 2;
		if(ll.get(ci) < ll.get(pi)) {
			swap(ci, pi);
			Upheapify(pi);
		}
	}
	
	private void swap(int ci, int pi) {
		int cth = ll.get(ci);
		int pth = ll.get(pi);
		ll.set(pi, cth);
		ll.set(ci, pth);
	}
	
	public void Display() {
		System.out.println(ll);
	}
	
	public void size() {
		System.out.println(ll.size());
	}
	
	public int remove() {
		swap(0, ll.size() - 1);
		int rv = ll.remove(ll.size() - 1);
		Downheapify(0);
		return rv;
	}
	
	private void Downheapify(int pi) {
		int lc = 2 * pi + 1;
		int rc = 2 * pi + 2;
		int mini = pi;
		if(lc < ll.size() && ll.get(lc) < ll.get(mini)) {
			mini = lc;
		}
		if(rc < ll.size() && ll.get(rc) < ll.get(mini)) {
			mini = rc;
		}
		if(mini != pi) {
			swap(mini, pi);
			Downheapify(mini);
		}
	}
}













