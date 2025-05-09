package Lec31;

import java.util.*;

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
	
	
//	Finding a node 
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
	
	
//	Assuming 0 is the height of one node
	public int ht() {
		return ht(root);
	}
	
	private int ht(Node nn) {
		if(nn == null) {
			return -1;
		}
		int lh = ht(nn.left);
		int rh = ht(nn.right);
		return Math.max(lh, rh) + 1;
	}
	
	
//	Pre-Order
	public void PreOrder() {
		PreOrder(root);
		System.out.println();
	}
	
	private void PreOrder(Node nn) {
		if(nn == null) {
			return;
		}
		
		System.out.print(nn.val + " ");
		PreOrder(nn.left);
		PreOrder(nn.right);
	}
	
	
//	In-Order
	public void InOrder() {
		InOrder(root);
		System.out.println();
	}
	
	private void InOrder(Node nn) {
		if(nn == null) {
			return;
		}
		
		InOrder(nn.left);
		System.out.print(nn.val + " ");
		InOrder(nn.right);
	}
	
	
//	Post-Order
	public void PostOrder() {
		PostOrder(root);
		System.out.println();
	}
	
	private void PostOrder(Node nn) {
		if(nn == null) {
			return;
		}
		
		PostOrder(nn.left);
		PostOrder(nn.right);
		System.out.print(nn.val + " ");
	}
	
	
//	Level-Order
	public void LevelOrder() {
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
	
}















