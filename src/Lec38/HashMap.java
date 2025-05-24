package Lec38;

import java.util.*;

public class HashMap<K, V> {
	class Node{
		K Key;
		V Value;
		Node next;
	}
		
	private ArrayList<Node> bucket;
	
	private int size = 0;
	
	public HashMap(int n) {
		// TODO Auto-generated constructor stub
		bucket = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bucket.add(null);
		}
	}
	
	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}
	
	public void put(K key, V value) {
		int idx = HashFunc(key);
		Node temp = bucket.get(idx);
		while(temp != null) {
			if(temp.Key.equals(key)) {
				temp.Value = value;
				return;
			}
			temp = temp.next;
		}
		
		Node nn = new Node();
		nn.Key = key;
		nn.Value = value;
		temp = bucket.get(idx);
		nn.next = temp;
		bucket.set(idx, nn);
		size++;
		
		double lf = (1.0 * size) / bucket.size();
		double thf = 2.0;
		if(lf > thf) {
			rehashing();
		}
	}
	
	public int HashFunc(K key) {
		int idx = key.hashCode() % bucket.size();
		if(idx < 0) {
			idx += bucket.size();
		}
		return idx;
	}
	
	public boolean containsKey(K key) {
		int idx = HashFunc(key);
		Node temp = bucket.get(idx);
		while(temp != null) {
			if(temp.Key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public V get(K key) {
		int idx = HashFunc(key);
		Node temp = bucket.get(idx);
		while(temp != null) {
			if(temp.Key.equals(key)) {
				return temp.Value;
			}
			temp = temp.next;
		}
		return null;
	}
	
	private void rehashing() {
		ArrayList<Node> a = new ArrayList<>();
		for (int i = 0; i < 2 * bucket.size(); i++) {
			a.add(null);
		}
		ArrayList<Node> old_bucket = bucket;
		bucket = a;
		size = 0;
		
		for(Node temp : old_bucket) {
			while(temp != null) {
				put(temp.Key, temp.Value);
				temp = temp.next;
			}
		}
	}
	
	public String toString() {
		String s = "{";
		for(Node temp : bucket) {
			while(temp != null) {
				s = s + temp.Key + "=" + temp.Value + ", ";
				temp = temp.next;
			}
		}
		s = s.substring(0, s.length() - 2) + s.substring(s.length() - 1);
		s = s.trim();
		return s + "}";
	}
	
}












