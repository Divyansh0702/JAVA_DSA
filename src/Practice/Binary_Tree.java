package Practice;

import java.lang.module.FindException;
import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Binary_Tree {
	
	private static class Node{
		int val;
		Node left;
		Node right;
		
		Node(int val){
			this.val = val;
		}
		
		Node(int val, Node left, Node right){
			this.val = val;
			this.left = left;
			this.right = right;
		}
		
	}
	
	private Node root;
	
	public Binary_Tree() {
		root = CreateTree();
	}
	
	Scanner sc = new Scanner(System.in);
	
	public Node CreateTree() {
		int item = sc.nextInt();
		Node nn = new Node(item);
		
		boolean hlc = sc.nextBoolean();
		if(hlc) {
			nn.left = CreateTree();
		}
		
		boolean rlc = sc.nextBoolean();
		if(rlc) {
			nn.right = CreateTree();
		}
		
		return nn;
	}
	
	public void Display() {
		Display(root);
	}
	
	private void Display(Node nn) {
		if(nn == null) {
			return;
		}
		
		String s = " <-- " + nn.val + " --> ";
		
		if(nn.left != null) {
			s = nn.left.val + s;
		}
		s = " . " + s;

		if(nn.right != null) {
			s = s + nn.right.val;
		}
		s = s + " . ";
		
		System.out.println(s);
		
		Display(nn.left);
		Display(nn.right);
		
	}
	
	public int max() {
		return max(root);
	}
	
	private int max(Node nn) {
		if(nn == null) {
			return Integer.MIN_VALUE;
		}
		
		int leftmax = max(nn.left);
		int rightmax = max(nn.right);
		return Math.max(nn.val, Math.max(leftmax, rightmax));
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
	
	public int height() {
		return height(root);
	}
	
	private int height(Node nn) {
		if(nn == null) {
			return -1;
		}
		
		int leftht = height(nn.left);
		int rightht = height(nn.right);
		return Math.max(leftht, rightht) + 1;
	}
	
	
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
	
	
	public void InOrder() {
		InOrder(root);
		System.out.println();
	}
	
	private void InOrder(Node nn) {
		if(nn == null) {
			return;
		}
		
		PreOrder(nn.left);
		System.out.print(nn.val + " ");
		PreOrder(nn.right);
	}
	
	
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
	
	public static void main(String[] args) {
//		10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
		Binary_Tree bt = new Binary_Tree();
		bt.Display();
//		Node nn = bt.new Node(0); // if inner class is non static then
//		we have to make instance of outer class in order to access inner class 

//		Node nn = new Node(0); // No need to make outer class instance because 
//		because inner class is static
		
		System.out.println(bt.max());
		
		System.out.println(bt.find(50));
		
		System.out.println(bt.height());
		
		bt.PreOrder();
		bt.InOrder();
		bt.PostOrder();
		bt.LevelOrder();
		
	}
}
