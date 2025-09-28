package Lec33;

import java.util.*;

public class Delete_Node_In_BST {
	
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
			this.root = CreateTree();
		}
		
		public Node CreateTree() {
			int size = sc.nextInt();
			int[] arr = new int[size];
			
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int val : arr) {
				if(val != -1) {
					this.root = CreateBSTree(root, val);					
				}
			}
			return root;
		}
		
		private Node CreateBSTree(Node root, int val) {
			if(root == null) {
				return new Node(val);
			}
			
			if(val < root.val) {
				root.left = CreateBSTree(root.left, val);
			}
			else {
				root.right = CreateBSTree(root.right, val);
			}
			
			return root;
		}
		
		public void LevelOrder() {
			LevelOrder(root);
		}
		private void LevelOrder(Node root) {
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			
			while(!q.isEmpty()) {
				Node rv = q.poll();
				System.out.print(rv.val + " ");
				
				if(rv.left != null) {
					q.add(rv.left);
				}
				if(rv.right != null) {
					q.add(rv.right);
				}
			}
			System.out.println();
		}
		
		
		public void delete() {
			int key = sc.nextInt();
			root =  delete(root,key);
		}
		
		private Node delete(Node root, int key) {
			if(root == null) {
				return null;
			}
			
			if(root.val > key) {
				root.left = delete(root.left, key);
			}
			else if(root.val < key) {
				root.right = delete(root.right, key);
			}
			else {
//				0 or 1 child
				if(root.left == null) {
					return root.right;
				}
				else if(root.right == null) {
					return root.left;
				}
				else {
					int max = max(root.left);
					root.left = delete(root.left, max);
					root.val = max;
				}
			}
			return root;
		}
		
		private int max(Node root) {
			if(root == null) {
				return Integer.MIN_VALUE;
			}
			
			int right = max(root.right);
			return Math.max(right, root.val);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		
		bt.LevelOrder();
		
		bt.delete();
		
		bt.LevelOrder();
		
		
	}

}
