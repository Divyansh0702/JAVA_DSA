package Assignment_8;

import java.util.*;

public class Replace_With_Sum_Of_Greater_Nodes {
	
	static Scanner sc = new Scanner(System.in);
	
	static private class BinaryTree{
		private class Node{
			int val;
			Node left;
			Node right;
			
			Node(int val){
				this.val = val;
			}
		}
		
		private Node root;
		
		public BinaryTree() {
			int size = sc.nextInt();
			int[] ino = new int[size];
			for (int i = 0; i < ino.length; i++) {
				ino[i] = sc.nextInt();
			}
			
			this.root = CreateTree(ino, 0, ino.length-1);
		}
		
		private Node CreateTree(int[] ino, int low, int high) {
			if(low > high) {
				return null;
			}
			
			int mid = (low + high)/ 2;
			Node tree = new Node(ino[mid]);
			
			tree.left = CreateTree(ino, low, mid-1);
			tree.right = CreateTree(ino, mid+1, high);
			return tree;
		}
		
		public void PreOrder() {
			PreOrder(root);
		}
		
		private void PreOrder(Node root) {
			if(root == null) {
				return;
			}
			
			System.out.print(root.val + " ");
			PreOrder(root.left);
			PreOrder(root.right);
		}
		
		private int sum = 0;
		
		public void sumGreater() {
			sumGreater(root);
		}
		
		private void sumGreater(Node root) {
			if(root == null) {
				return;
			}
			
			sumGreater(root.right);
			sum += root.val;
			root.val = sum;
			sumGreater(root.left);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		
		bt.sumGreater();
		
		bt.PreOrder();
	}

}
