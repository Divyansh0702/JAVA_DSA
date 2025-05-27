package Lec40;

import java.util.*;

public class Dijikstra_Algorithm {

	private HashMap<Integer, HashMap<Integer, Integer>> map;
	
	public Dijikstra_Algorithm(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());		
		}
	}
	
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
	class DijikstraPair{
		int vtx;
		String acqpath;
		int cost;
		
		public DijikstraPair(int vtx, String acqpath, int cost) {
			this.vtx = vtx;
			this.acqpath = acqpath;
			this.cost = cost;
		}
		
		@Override
		public String toString() {
			return this.vtx + " " + this.acqpath + " @ " + this.cost;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dijikstra_Algorithm da = new Dijikstra_Algorithm(7);
		da.AddEdge(1, 2, 2);
		da.AddEdge(2, 3, 3);
		da.AddEdge(1, 4, 10);
		da.AddEdge(4, 5, 8);
		da.AddEdge(3, 4, 1);
		da.AddEdge(5, 6, 5);
		da.AddEdge(5, 7, 6);
		da.AddEdge(6, 7, 4);

		da.DijikstraAlgo(1);
	}
	
	public void DijikstraAlgo(int src) {
		PriorityQueue<DijikstraPair> pq = new PriorityQueue<>(new Comparator<DijikstraPair>() {
			@Override
			public int compare(DijikstraPair o1, DijikstraPair o2) {
//				if(o1.cost == o2.cost) {
//					return o1.acqpath.length() - o2.acqpath.length();
//				}
//				else {
//					return o1.cost -  o2.cost;					
//				}
				return o1.cost -  o2.cost;
			}
		});
		
		HashSet<Integer> visited = new HashSet<>();
		
		pq.add(new DijikstraPair(src, ""+src, 0));
		while(!pq.isEmpty()) {
//			1. remove
			DijikstraPair rp = pq.poll();
			
//			2. ignore if already visited
			if(visited.contains(rp.vtx)) {
				continue;
			}
			
//			3. mark visited
			visited.add(rp.vtx);
			
//			4. self work
			System.out.println(rp);
			
//			5. add unvisited nbrs
			for(int nbrs : map.get(rp.vtx).keySet()) {
				if(!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new DijikstraPair(nbrs, rp.acqpath + nbrs, rp.cost + cost));
				}
			}
		}
	}

}














