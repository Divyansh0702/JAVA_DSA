package Lec33;

import java.util.*;

public class Validate_BST {

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
		
		
		class BSTPair{
			boolean isbst = true;
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
		}
		
		public boolean validateBST() {
			return validateBST(root).isbst;
		}
		
		private BSTPair validateBST(Node root) {
			if(root == null) {
				return new BSTPair();
			}
			
			BSTPair lbp = validateBST(root.left);
			BSTPair rbp = validateBST(root.right);
			BSTPair sbp = new BSTPair();
			
			sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
			sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
			sbp.isbst = lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val;
			
			return sbp;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		
		System.out.println(bt.validateBST());
		
	}

}
