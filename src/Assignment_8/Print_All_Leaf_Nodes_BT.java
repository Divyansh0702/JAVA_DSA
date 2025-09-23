package Assignment_8;

import java.util.*;

public class Print_All_Leaf_Nodes_BT {

	static Scanner sc = new Scanner(System.in);	
	
	static private class BinaryTree{
		class Node{
			int val;
			Node left;
			Node right;
			
			public Node(int val) {
				this.val = val;
			}
		}
		
		private Node root;
		
		public void CreateTree() {
			CreateTreeLevelOrder();
		}
		
		private void CreateTreeLevelOrder() {
			int p = sc.nextInt();
			Node nn = new Node(p);
			root = nn;
			
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			
			while(!q.isEmpty()) {
				Node rv = q.poll();
				int c1 = sc.nextInt();
				int c2 = sc.nextInt();
				
				if(c1 != -1) {
					Node newNode = new Node(c1); 
					q.add(newNode);
					rv.left = newNode;
				}
				if(c2 != -1) {
					Node newNode = new Node(c2);
					q.add(newNode);
					rv.right = newNode;
				}
			}
		}
		
		public void printLeaf() {
			printLeaf(root);
		}
		
		private void printLeaf(Node root) {
			if(root == null) {
				return;
			}
			
			if(root.left == null && root.right == null) {
				System.out.print(root.val + " ");
				return;
			}
			
			printLeaf(root.left);
			printLeaf(root.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub asdfasfd
		BinaryTree bt = new BinaryTree();
		bt.CreateTree();
		
		bt.printLeaf();
	}

}
