package Lec32;

import java.util.*;

public class Diameter_Of_Binary_Tree_Optimized {

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
			
			return CreateTree(arr, 0);
		}
		
		private Node CreateTree(int[] arr, int i) {
			if(i >= arr.length || arr[i] == -1) {
				return null;
			}
			
			Node tree = new Node(arr[i]);
			
			tree.left = CreateTree(arr, 2*i + 1);
			tree.right = CreateTree(arr, 2*i + 2);
			return tree;
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
		
		
		class DiaPair{
			int ht = -1;
			int dia = 0;
		}
		
		public int diameterOfBinaryTree() {	
			return diameter(root).dia;
		}
		
		private DiaPair diameter(Node root) {
			if(root == null) {
				return new DiaPair();
			}
			
			DiaPair ldp = diameter(root.left);
			DiaPair rdp = diameter(root.right);
			DiaPair sdp = new DiaPair();
			
			sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
			int sd = ldp.ht + rdp.ht + 2;
			sdp.dia = Math.max(sd, Math.max(ldp.dia, rdp.dia));
			
			return sdp;
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		
		System.out.println(bt.diameterOfBinaryTree());
	}

}
