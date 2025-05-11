package Lec36;

import java.util.*;

public class Heap {

	private ArrayList<Integer> ll = new ArrayList<>();
	public void add(int item) {
		ll.add(item);
		upheapify(ll.size() - 1);
	}
	
	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		if(ll.get(ci) < ll.get(pi)) {
			swap(ci, pi);
			upheapify(pi);
		}
	}
	
	private void swap(int ci, int pi) {
		int pth = ll.get(pi);
		int cth = ll.get(ci);
		ll.set(pi, cth);
		ll.set(ci, pth);
	}
	
	public int size() {
		return ll.size();
	}
	
	public int get() {
		return ll.get(0);
	}
	
	public void Display() {
		System.out.println(ll);
	}
	
	public int remove() {
		swap(0, ll.size()-1);
		int rv = ll.remove(ll.size()-1);
		Downheapify(0);
		return rv;
	}

	private void Downheapify(int pi) {
		int lc = 2*pi+1;
		int rc = 2*pi+2;
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













