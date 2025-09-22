package Assignment_8;

import java.util.*;

public class Sum_Of_Nodes_BT {
	static Scanner sc = new Scanner(System.in);
	
	static private class BinaryTree{
		private class Node{
			int val;
			Node left;
			Node right;
			
			public Node(int val) {
				this.val = val;
			}
		}
		
		private Node root;
		
		public BinaryTree() {
			this.root = takeInput();
		}
		
		private Node takeInput() {
			int nnval = sc.nextInt();
			Node nn = new Node(nnval);
			
			boolean hlc = sc.nextBoolean();
			if(hlc) {
				nn.left = takeInput();
			}
			
			boolean hrc = sc.nextBoolean();
			if(hrc) {
				nn.right = takeInput();
			}
			
			return nn;
		}
		
		public int sumOfNodes() {
			return this.sumOfNodes(this.root) ;
		}
		
		private int sumOfNodes(Node root) {
			if(root == null) {
				return 0;
			}
			
			int left = sumOfNodes(root.left);
			int right = sumOfNodes(root.right);
			return left + root.val + right;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		
		System.out.println(bt.sumOfNodes());
	}

//	50 true 25 true 12 false false false true 75 true 62 false false false
}
