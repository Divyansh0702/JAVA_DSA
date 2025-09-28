package Lec32;

import java.util.*;

public class Balanced_Binary_Tree {
	
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
		
		
		class bpair{
			boolean isbal = true;
			int ht = -1;
		}
		public boolean isbalanced() {
			return isbalanced(root).isbal;
		}
		private bpair isbalanced(Node root) {
			if(root == null) {
				return new bpair();
			}
			
			bpair lbp = isbalanced(root.left);
			bpair rbp = isbalanced(root.right);
			bpair sbp = new bpair();
			
			sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;
			boolean sb = Math.abs(lbp.ht - rbp.ht) <= 1;
			sbp.isbal = sb && lbp.isbal && rbp.isbal;
			
			return sbp;
		}
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		
		System.out.println(bt.isbalanced());
	}

}
