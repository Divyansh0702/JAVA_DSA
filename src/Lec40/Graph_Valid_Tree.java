package Lec40;
import java.util.*;
public class Graph_Valid_Tree {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] edges = {{0,1},{0,2},{0,3},{1,4}};
		
		System.out.println(validTree(5, edges));
	}
	
	public static boolean validTree(int n, int[][] edges) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(i, new ArrayList<>());
		}
		
		for (int i = 0; i < edges.length; i++) {
			int a = edges[i][0];
			int b = edges[i][1];
			map.get(a).add(b);
			map.get(b).add(a);
		}
		return BFT(map);
		
	}
	
	public static boolean BFT(HashMap<Integer, ArrayList<Integer>> map) {
		Queue<Integer> q = new LinkedList<Integer>();
		HashSet<Integer> visited = new HashSet<>();
		
		int c = 0;
		for(int src : map.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			c++;
			q.add(src);
			while(!q.isEmpty()) {
				// 1. remove
				int r = q.poll();
				
				// 2. Ignore if Already visited
				if(visited.contains(r)) {
					return false;
				}
				// 3. marked visited
				visited.add(r);
				
				// 4. self work
//				System.out.print(r + " ");
				
				// 5. add unvisited nbrs
				for(int nbrs : map.get(r)) {
					if(!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		return c == 1;
	}
	
//	public static boolean validTree(int n, int[][] edges) {
//		HashMap<Integer, List<Integer>> map = new HashMap<>();
//		for (int i = 0; i < n; i++) {
//			map.put(i, new ArrayList<>());
//		}
//		for (int i = 0; i < edges.length; i++) {
//			int a = edges[i][0];
//			int b = edges[i][1];
//			map.get(a).add(b);
//			map.get(b).add(a);
//		}
//		return BFT(map);
//	}
//
//	public static boolean BFT(HashMap<Integer, List<Integer>> map) {
//		Queue<Integer> q = new LinkedList<Integer>();
//		HashSet<Integer> visited = new HashSet<>();
//		int c = 0;
//		for(int src : map.keySet()) {
//			if(visited.contains(src)) {
//				continue;
//			}
//			c++;
//			q.add(src);
//			while(!q.isEmpty()) {
//				// 1. remove
//				int r = q.poll();
//				
//				// 2. Ignore if Already visited
//				if(visited.contains(r)) {
//					return false;
//				}
//				// 3. marked visited
//				visited.add(r);
//				
//				// 4. self work
//				System.out.print(r + " ");
//				
//				// 5. add unvisited nbrs
//				for(int nbrs : map.get(r)) {
//					if(!visited.contains(nbrs)) {
//						q.add(nbrs);
//					}
//				}
//			}
//		}
//		return c == 1;
//	}
}
