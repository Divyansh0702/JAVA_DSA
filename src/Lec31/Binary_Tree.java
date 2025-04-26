package Lec31;

import java.util.Scanner;

public class Binary_Tree {
	
	private class Node{
		int val;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public Binary_Tree() {
		root = CreateTree();
	}
	
	Scanner sc = new Scanner(System.in);

	// Creation of Tree
	private Node CreateTree() {
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		
		boolean hlc = sc.nextBoolean();
		if(hlc) {
			nn.left = CreateTree();
		}
		
		boolean hrc = sc.nextBoolean();
		if(hrc) {
			nn.right = CreateTree();
		}
		
		return nn;
	}
	
	// Displaying tree
	public void Display() {
		Display(root);
	}
	
	private void Display(Node nn) {
		if(nn == null) {
			return;
		}
		
		String s = "<--" + nn.val + "-->";
		
		if(nn.left != null) {
			s = nn.left.val + s;
		}
		else {
			s = "." + s;
		}
		
		if(nn.right != null) {
			s = s + nn.right.val;
		}
		else {
			s = s + ".";
		}
		
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);

	}
	
	public int max() {
		return max(root);
	}
	
	// Finding max node in tree
	private int max(Node nn) {
		if(nn == null) {
			return Integer.MIN_VALUE;
		}
		int lmax = max(nn.left);
		int rmax = max(nn.right);
		return Math.max(nn.val, Math.max(lmax, rmax));
	}
	
	public boolean find(int item) {
		return find(root, item);
	}
	
	private boolean find(Node nn, int item) {
		if(nn == null) {
			return false;
		}
		if(nn.val == item) {
			return true;
		}
		
		boolean left = find(nn.left, item);
		boolean right = find(nn.right, item);
		return left || right;
	}
	
	
	
	
}















