package Assignment_8;

import java.util.*;

public class Sibling_BT {
	
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
		
		public void sibling() {
			this.sibling(this.root);
		}

		private void sibling(Node root) {
			if(root == null) {
				return;
			}
			
			if(root.left != null) {
				if(root.right == null) {
					System.out.print(root.left.val + " ");
				}
			}
			
			if(root.right != null) {
				if(root.left == null) {
					System.out.print(root.right.val + " ");					
				}
			}
			
			if(root.left == null && root.right == null) {
				return;
			}
		
			
			sibling(root.left);
			sibling(root.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		
		bt.sibling();
	}
	
//  Input
//	50 true 12 true 18 false false false false
}
