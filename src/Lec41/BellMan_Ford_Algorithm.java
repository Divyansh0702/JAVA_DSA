package Lec41;

import java.util.*;

public class BellMan_Ford_Algorithm {

	private HashMap<Integer, HashMap<Integer, Integer>> map;
	
	public BellMan_Ford_Algorithm(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());		
		}
	}
	
	public void Addedge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost); // directed graph
	}
	
	class EdgeList{
		int e1, e2, cost;
	
		public EdgeList(int e1, int e2, int cost) {
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;			
		}
	}
	
	
	public List<EdgeList> getAllEdge(){
		List<EdgeList> ll = new ArrayList<>();
		
		for(int e1 : map.keySet()) {
			for(int e2 : map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new EdgeList(e1, e2, cost));
			}
		}
		return ll;
	}
	
	
	public void BellManFord() {
		List<EdgeList> ll = getAllEdge();
		int v = map.size();
		int[] dis = new int[v + 1];
		for (int i = 2; i < dis.length; i++) {
			dis[i] = 9999999;
		}
		
		for (int i = 1; i < v; i++) {
			for(EdgeList e : ll) {
				if(i == v && dis[e.e2] > dis[e.e1] + e.cost) {
					System.out.println("-ve wt cycle hai");
					return;
				}
				
				if(dis[e.e2] > dis[e.e1] + e.cost) {
					dis[e.e2] = dis[e.e1] + e.cost;
				}
			}
		}
		
		for (int i = 1; i < dis.length; i++) {
			System.out.println(i + " " + dis[i]);
		}
	}
	
	public static void main(String[] args) {
		BellMan_Ford_Algorithm bf = new BellMan_Ford_Algorithm(5);
		bf.Addedge(1, 2, 8);
		bf.Addedge(1, 3, 4);
		bf.Addedge(1, 4, 5);
		bf.Addedge(3, 4, -3);
		bf.Addedge(4, 5, 4);
		bf.Addedge(5, 2, 1);
		bf.Addedge(2, 5, 2);
		
		bf.BellManFord();
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
