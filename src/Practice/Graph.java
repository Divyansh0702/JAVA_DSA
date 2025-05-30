package Practice;

import java.util.*;

public class Graph {
	private HashMap<Integer, HashMap<Integer , Integer>> map;
	
	public Graph(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
	public boolean containsEdge(int v1 ,int v2) {
		return map.get(v1).containsKey(v2);
	}
	
	public boolean containsVertex(int v1) {
		return map.containsKey(v1);
	}
	
	private int size = 0;
	
	public int NoOfEdge() {
		int sum = 0;
		for(int key : map.keySet()) {
			sum += map.get(key).size();
		}
		return sum / 2;
	}
	
	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}
	
	public void removeVertex(int v1){
		for(int nbrs : map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);
		}
		map.remove(v1);
	}
	
	public void Display() {
		for(int key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}
	
	private boolean hasPath(int src, int des, HashSet<Integer> visited) {
// It will only search for 2th depth

//		if(map.get(v1).containsKey(v2)) {
//			return true;
//		}
//		else {
//			for(int nbrs : map.get(v1).keySet()) {
//				if(map.get(nbrs).containsKey(v2)) {
//					return true;
//				}
//			}			
//		}
//		
//		return false;
		
// We wiil use recursive approach here to iterate through the depth of the graph
		if(src == des) {
			return true;
		}
		
		visited.add(src);
		for(int nbrs : map.get(src).keySet()) {
			if(!visited.contains(nbrs)) {
				boolean ans = hasPath(nbrs, des, visited);
				if(ans) {
					return true;
				}				
			}
		}
		return false;
	
	}
	
	public boolean hasPath(int src, int des) {
		return hasPath(src, des, new HashSet<>());
	}
	
	public void printPath(int src, int des, String ans, HashSet<Integer> visited) {
		if(src == des) {
			System.out.println(ans + des);
			return;
		}
		
		visited.add(src);
		for(int nbrs : map.get(src).keySet()) {
			if(!visited.contains(nbrs)) {
				printPath(nbrs, des, ans + src, visited);		
			}
		}
		visited.remove(src);
	}
		
	
	public boolean BFS(int src, int des) {
		Queue<Integer> q = new LinkedList<Integer>();
		HashSet<Integer> visited = new HashSet<Integer>();
		
		q.add(src);
		while(!q.isEmpty()) {
//			remove
			int rv = q.poll();
			
//			ignore
			if(visited.contains(rv)) {
				continue;
			}
			
//			mark the visited
			visited.add(rv);
			
//			self-work
			if(rv == des) {
				return true;
			}
			
//			add unvisited nbrs
			for(int nbrs : map.get(rv).keySet()) {
				if(!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;	
	}
	
	
	public boolean DFS(int src, int des) {
		Stack<Integer> s = new Stack<Integer>();
		HashSet<Integer> visited = new HashSet<Integer>();
		
		s.push(src);
		while(!s.isEmpty()) {
//			remove
			int rv = s.pop();
			
//			ignore
			if(visited.contains(rv)) {
				continue;
			}
			
//			mark the visited
			visited.add(rv);
			
//			self-work
			if(rv == des) {
				return true;
			}
			
//			add unvisited nbrs
			for(int nbrs : map.get(rv).keySet()) {
				if(!visited.contains(nbrs)) {
					s.push(nbrs);
				}
			}
		}
		return false;	
	}
	
	
	public void BFT() {
		Queue<Integer> q = new LinkedList<Integer>();
		HashSet<Integer> visited = new HashSet<Integer>();
		
		for(int src : map.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			
			q.add(src);
			while(!q.isEmpty()) {
//				remove
				int rv = q.poll();
				
//				ignore
				if(visited.contains(rv)) {
					continue;
				}
				
//				mark the visited
				visited.add(rv);
				
//				self-work
				System.out.print(rv + " ");
				
//				add unvisited nbrs
				for(int nbrs : map.get(rv).keySet()) {
					if(!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		System.out.println();
	}
	
	
	public void DFT() {
		Stack<Integer> s = new Stack<Integer>();
		HashSet<Integer> visited = new HashSet<Integer>();
		
		for(int src : map.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			
			s.push(src);
			while(!s.isEmpty()) {
				int rv = s.pop();
				
				if(visited.contains(rv)) {
					continue;
				}
				
				visited.add(rv);
				
				System.out.print(rv + " ");
				
				for(int nbrs : map.get(rv).keySet()) {
					if(!visited.contains(nbrs)) {
						s.push(nbrs);
					}
				}
			}
		}
		System.out.println();
	}
	
}













