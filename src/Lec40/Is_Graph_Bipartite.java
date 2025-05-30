package Lec40;

import java.util.*;

public class Is_Graph_Bipartite {
	class BipartitePair{
		int vtx;
		int dist;
		
		public BipartitePair(int vtx, int dist) {
			this.vtx = vtx;
			this.dist = dist;
		}
	}
	

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	}
	
	public boolean isBipartite(int[][] graph) {
		HashMap<Integer, Integer> visited = new HashMap<>();
		Queue<BipartitePair> q = new LinkedList<>();
		
		for (int vtx = 0; vtx < graph.length; vtx++) {
			if(visited.containsKey(vtx)){
				continue;
			}
			
			q.add(new BipartitePair(vtx, 0));
			while(!q.isEmpty()) {
//				remove
				BipartitePair bp = q.poll();
				
//				ignore
				if(visited.containsKey(bp.vtx)) {
					if(visited.get(bp.vtx) != bp.dist) {
						return false;
					}
					continue;
				}
				
//				mark visited
				visited.put(bp.vtx, bp.dist);
				
//				add unvisited nbrs
				for(int nbrs : graph[bp.vtx]) {
					if(!visited.containsKey(nbrs)) {
						q.add(new BipartitePair(nbrs, bp.dist + 1));
					}
				}
			}
		}
		return true;
	}
	
}

//	class BipartitePair{
//		int vtx;
//		int dis;
//		
//		public BipartitePair(int vtx, int dis) {
//			this.dis = dis;
//			this.vtx = vtx;
//		}
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	public boolean isBipartite(int[][] graph) {
//		Queue<BipartitePair> q = new LinkedList<>();
//		HashMap<Integer, Integer> visited = new HashMap<>();
//		for (int vtx = 0; vtx < graph.length; vtx++) {
//			if(visited.containsKey(vtx)) {
//				continue;
//			}
//			
//			q.add(new BipartitePair(vtx, 0));
//			while(!q.isEmpty()) {
////				1. remove
//				BipartitePair rp = q.poll();
//				
////				2. ignore if all visited
//				if(visited.containsKey(rp.vtx)) {
//					if(visited.get(rp.vtx) != rp.dis) {
//						return false; // odd length						
//					}
//					continue;
//				}
//				
////				3. mark visited
//				visited.put(rp.vtx, rp.dis);
//				
////				4. self work
//				
////				5. add unvisited nbrs
//				for(int nbrs : graph[rp.vtx]) {
//					if(!visited.containsKey(nbrs)) {
//						q.add(new BipartitePair(nbrs, rp.dis + 1));
//					}
//				}
//			}
//		}
//		return true;
//	}
//	
//}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
