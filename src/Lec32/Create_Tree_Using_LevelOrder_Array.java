package Lec32;

import java.util.*;

public class Create_Tree_Using_LevelOrder_Array {
	
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
	
//	Just for display
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,-1,-1,6,-1,-1,7};
		Node tree = toTree(arr, 0);
		levelOrder(tree);
	}

}
