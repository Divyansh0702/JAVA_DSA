package Lec33;

import java.util.*;

public class Maximum_Sum_BST_In_BinaryTree {
	
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
		
		
		class bpair{
			boolean isbst = true;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int sum = 0;
			int ans = 0;
		}
		
		public int maxSumBST() {
			return maxSumBST(root).ans;
		}
		private bpair maxSumBST(Node root) {
			if(root == null) {
				return new bpair();
			}
			
			bpair lbp = maxSumBST(root.left);
			bpair rbp = maxSumBST(root.right);
			bpair sbp = new bpair();
			
			sbp.max = Math.max(root.val, Math.max(lbp.max, rbp.max));
			sbp.min = Math.min(root.val, Math.min(lbp.min, rbp.min));
			
			sbp.isbst = lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val;
			
			if(sbp.isbst) {
				sbp.sum = lbp.sum + rbp.sum + root.val;
				sbp.ans = Math.max(lbp.ans, Math.max(rbp.ans, sbp.sum));
			} else {
				sbp.sum = 0;
				sbp.ans = Math.max(lbp.ans, rbp.ans);
			}
			
			return sbp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		
		System.out.println(bt.maxSumBST());
	}
}
