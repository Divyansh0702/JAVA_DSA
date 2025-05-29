package Practice;

public class Graph_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(4);
		g.addEdge(1, 2, 3);
		g.addEdge(1, 4, 2);
		g.addEdge(2, 1, 3);
		g.addEdge(2, 3, 1);
		g.addEdge(2, 4, 2);
		g.addEdge(3, 2, 1);
		g.addEdge(3, 4, 5);
		g.addEdge(4, 1, 2);
		g.addEdge(4, 3, 5);
		g.addEdge(4, 2, 2);
		
		g.Display();
		System.out.println(g.containsEdge(1, 3));
		System.out.println(g.containsVertex(5));
		System.out.println(g.NoOfEdge());

//		g.removeEdge(1, 4);
//		g.removeVertex(1);
		
		g.Display();
		
		System.out.println(g.hasPath(1, 3));
		g.printPath(1, 3, "");
		
		System.out.println();
		System.out.println(g.BFS(1, 3));
		System.out.println(g.DFS(1, 4));
		
		g.BFT();
		
	}

}
