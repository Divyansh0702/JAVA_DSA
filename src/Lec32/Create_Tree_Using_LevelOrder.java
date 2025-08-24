package Lec32;

import java.util.*;

public class Create_Tree_Using_LevelOrder {
	
	class Node{
		int val;
		Node left;
		Node right;
		
		public Node(int val){
			this.val = val;
		}
	}
	
	private Node root;
	
	public Create_Tree_Using_LevelOrder() {
		createTree();
	}
	
	private void createTree() {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		Node nn = new Node(val);
		root = nn;
		
		Queue<Node> q = new LinkedList<>();
		q.add(nn);
		while(!q.isEmpty()) {
			Node rv = q.poll();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if(c1 != -1) {
				Node newNode = new Node(c1);
				rv.left = newNode;
				q.add(newNode);
			}
			if(c2 != -1) {
				Node newNode = new Node(c2);
				rv.right = newNode;
				q.add(newNode);
			}
		}
	}
	
	
	public void Display() {
		Display(root);
	}
	
	private void Display(Node nn) {
		if(nn == null) {
			return;
		}
		
		String s = "<--" + nn.val + "-->";
		
		if(nn.left != null) {
			s = nn.left.val + s;
		}
		else {
			s = "." + s;
		}
		
		if(nn.right != null) {
			s = s + nn.right.val;
		}
		else {
			s = s + ".";
		}
		
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Create_Tree_Using_LevelOrder cl = new Create_Tree_Using_LevelOrder();
		cl.Display();
	}

}
