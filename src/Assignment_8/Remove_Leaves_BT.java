package Assignment_8;

import java.util.*;

public class Remove_Leaves_BT {
	
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
		
		public void display() {
			this.display(this.root);
		}
		
		private void display(Node root) {
			if(root == null) {
				return;
			}
		
			String str = " " + root.val + " ";
			
			if(root.left != null) {
				str = root.left.val + " =>" + str;
			}else {
				str = "END" + " =>" + str;
			}
			
			if(root.right != null) {
				str = str + "<= " + root.right.val;
			}else {
				str = str + "<= " + "END";
			}
			
			System.out.println(str);
			display(root.left);
			display(root.right);
		}
		
		public void remove() {
			this.remove(null, this.root, false);
		}
		
		private void remove(Node parent, Node child, boolean ilc) {
			if(child == null) {
				return;
			}
			
			if(child.left == null && child.right == null) {
				if(parent == null) {
					root = null;
				}
				else {
					if(ilc) {
						parent.left = null;
					}
					else {
						parent.right = null;
					}
				}
			}
			
			remove(child ,child.left, true);
			remove(child ,child.right, false);
		}
		
//		public Node remove() {
//			return this.remove(this.root);
//		}
//		
//		private Node remove(Node root) {
//			if(root == null) {
//				return null;
//			}
//			
//			if(root.left == null && root.right == null) {
//				return null;
//			}
//			
//			root.left = remove(root.left);
//			root.right = remove(root.right);
//			return root;
//		}
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		
		bt.remove();
		bt.display();
	}
	
//	50 true 12 true 18 false false false false

}
