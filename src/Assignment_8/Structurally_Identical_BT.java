package Assignment_8;

import java.util.*;

public class Structurally_Identical_BT {
	
	Scanner sc = new Scanner(System.in);
	
	private class BinaryTree{
		private class Node{
			int val;
			Node left;
			Node right;
			
			public Node(int val) {
				this.val = val;
			}
		}
		
		private Node root;
		
		public BinaryTree() {
			this.root = takeInput();
		}
		
		private Node takeInput() {
			int nnval = sc.nextInt();
			Node nn = new Node(nnval);
			
			boolean hlc = sc.nextBoolean();
			if(hlc) {
				nn.left = takeInput();
			}
			
			boolean hrc = sc.nextBoolean();
			if(hrc) {
				nn.right = takeInput();
			}
			
			return nn;
		}
		
		private boolean StructurallyIdentical(Node tree1, Node tree2) {
			if(tree1 == null) {
				return tree2 == null;
			}
			
			if(tree2 == null) {
				return tree1 == null;
			}
			
			boolean left = StructurallyIdentical(tree1.left, tree2.left);
			boolean right = StructurallyIdentical(tree1.right, tree2.right);
			
			return left && right;
		}
		
		public boolean StructurallyIdentical(BinaryTree tree) {
			return this.StructurallyIdentical(this.root, tree.root);
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Structurally_Identical_BT SIBT = new Structurally_Identical_BT();
		BinaryTree bt1 = SIBT.new BinaryTree();
		BinaryTree bt2 = SIBT.new BinaryTree();
		
		System.out.println(bt1.StructurallyIdentical(bt2));
		
//		10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
//		10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
	}

}
