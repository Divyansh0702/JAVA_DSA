package Assignment_8;

import java.util.*;

public class Level_Order_ZigzagBT {
	
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
		
		public void LevelOrderZZ() {
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			
			int lvl = 2;
			
			while(!q.isEmpty()) {
				Node rv = q.poll();
				if(lvl % 2 == 0) {
					
				}
				System.out.print(rv.val + " ");
				
				if(lvl % 2 == 0) {
					if(rv.right != null) {
						q.add(rv.right);
					}
					if(rv.left != null) {
						q.add(rv.left);					
					}
				}
				
				else {
					if(rv.left != null) {
						q.add(rv.left);					
					}
					if(rv.right != null) {
						q.add(rv.right);
					}
				}
				
				lvl++;
			}
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt1 = new BinaryTree();
		
		bt1.LevelOrderZZ();
	}
	
//	10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
}
