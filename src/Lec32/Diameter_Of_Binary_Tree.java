package Lec32;

import java.util.LinkedList;
import java.util.Queue;

public class Diameter_Of_Binary_Tree {
	
	static class Node{
		int val;
		Node left;
		Node right;
		
		Node(int val){
			this.val = val;
		}
	}
	
	public static Node toTree(int[] arr, int i) {
		if(i >= arr.length || arr[i] == -1) {
			return null;
		}
		
		Node root = new Node(arr[i]);
		root.left = toTree(arr, 2*i + 1);
		root.right = toTree(arr, 2*i + 2);
		return root;
	}
	
	public static void levelOrder(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node rv = q.remove();
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
	
	
//	Brute-Force Approach O(N^2) - reduntant height calls
//	public static int Diameter(Node root) {
//		if(root == null) {
//			return 0;
//		}
//		
//		int ld = Diameter(root.left);
//		int rd = Diameter(root.right);
//		int sd = height(root.left) + height(root.right) + 2;
//		return Math.max(sd, Math.max(ld, rd));
//	}
//	public static int height(Node root) {
//		if(root == null) {
//			return -1;
//		}
//		
//		int lht = height(root.left);
//		int rht = height(root.right);
//		return Math.max(lht, rht) + 1;
//	}
	
	
// Best Optimized Approach using class by storing height and returning it to
//	the node without reduntant calls 
//	O(N)
	static class DiaPair{
		int dia = 0;
		int ht = -1;
	}
	
	public static DiaPair Diameter(Node root) {
		if(root == null) {
			return new DiaPair();
		}
		
		DiaPair ldp = Diameter(root.left);
		DiaPair rdp = Diameter(root.right);
		DiaPair sdp = new DiaPair();
		
		sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
		int sd = ldp.ht + rdp.ht + 2;
		sdp.dia = Math.max(sd, Math.max(ldp.dia, rdp.dia));
		
		return sdp;
	}	
	
//	using array to store diameter value - O(N)
//	public static int diameter(Node root){
//        int[] dia = new int[1];
//        height(root, dia);
//        return dia[0]; 
//   }
//	public static int height(Node root, int[] dia) {
//		if(root == null) {
//			return 0;
//		}
//		
//		int left = height(root.left, dia);
//		int right = height(root.right, dia);
//		
//		dia[0] = Math.max(dia[0], left + right);
//		
//		return Math.max(left, right) + 1;
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Go find at leetcode
		
		int[] arr = {1,2,3,4,5,-1,-1,6,-1,-1,7};
		Node tree = toTree(arr, 0);
		levelOrder(tree);
		
//		System.out.println(Diameter(tree));
		
		System.out.println(Diameter(tree).dia);
		
//		System.out.println(diameter(tree));
	}

}
