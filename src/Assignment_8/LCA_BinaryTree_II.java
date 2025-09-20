package Assignment_8;

import java.util.*;

public class LCA_BinaryTree_II {
	
	static class Node{
		int val;
		Node left;
		Node right;
		
		Node(int val){
			this.val = val;
		}
	}
	
	public static Node createTree(int[] arr, int i) {
		if(i >= arr.length || arr[i] == -1) {
			return null;
		}
		Node root = new Node(arr[i]);
		
		root.left = createTree(arr, 2 * i + 1);
		root.right = createTree(arr, 2 * i + 2);
		
		return root;
	}
	
	public static void LevelOrder(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()){
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
	
	static boolean foundP, foundQ;
	
	private static Node check(Node root, Node p, Node q) {
		if(root == null) {
			return null;
		}
		
		Node left = check(root.left, p, q);
		Node right = check(root.right, p, q);
		
		if(root == p) {
			foundP = true;
			return root;
		}
		if(root == q) {
			foundQ = true;
			return root;
		}
		
		if(left != null && right != null) {
			return root;
		}
		
		return (left == null) ? right : left;
	}
	
	public static Node LCAII(Node root, Node p, Node q) {
		foundP = false;
		foundQ = false;
		
		Node lca = check(root, p, q);
		return (foundP && foundQ) ? lca : null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,1,6,2,0,8,-1,-1,7,4};
		Node root = createTree(arr, 0);
		LevelOrder(root);
		
		Node res = LCAII(root, root.left, root.left.right.right);
		System.out.println(res.val);
	}

}
