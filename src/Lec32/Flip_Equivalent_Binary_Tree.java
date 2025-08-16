package Lec32;

import java.util.*;

public class Flip_Equivalent_Binary_Tree {
	
	 public static class Node {
		 int val;
	      Node left;
	      Node right;
	      Node() {}
	      Node(int val) { this.val = val; }
	      Node(int val, Node left, Node right) {
	    	  this.val = val;
	          this.left = left;
	          this.right = right; 
	      }    
	 }

//	 binary tree -> left child (2*i + 1) and right child (2*i + 2)	 
	 public static Node toTree(int[]arr, int i) {
		 if(i >= arr.length) {
			 return null;
		 }
		 Node root = new Node(arr[i]);
		 root.left = toTree(arr, 2*i + 1);
		 root.right = toTree(arr, 2*i + 2);
		 return root;
	 }
	 
	 public static void LevelOrder(Node root) {
		 if(root == null) {
			 return;
		 }
		 	
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
	 
	public static boolean flipEquiv(Node root1, Node root2) {
	       if(root1 == null && root2 == null){
	           return true;
	       }

	       if(root1 == null || root2 == null){
	           return false;
	       }

	       if(root1.val != root2.val){
	           return false;
	       }

	       boolean flip = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
	       boolean noflip = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
	       return flip || noflip;
	 }
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5,6,7,8};
		int[] arr2 = {1,3,2,6,4,5,8,7};
		
		Node root1 = toTree(arr1, 0);
		Node root2 = toTree(arr2, 0);
		
		LevelOrder(root1);
		LevelOrder(root2);
		
		System.out.println(flipEquiv(root1, root2));
	}

}
