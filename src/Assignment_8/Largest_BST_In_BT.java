package Assignment_8;

import java.util.*;

public class Largest_BST_In_BT {
	
		static class BinaryTree {

			private class Node {
				int val;
				Node left;
				Node right;

				Node(int data, Node left, Node right) {
					this.val = data;
					this.left = left;
					this.right = right;
				}
			}

			private Node root;
			private int size;

			public int size() {
				return this.size;
			}

			public boolean isempty() {
				return this.size == 0;
			}

			public BinaryTree() {
				Scanner scn = new Scanner(System.in);
				this.root = this.takeinput(scn, null, false);
			}

			private Node takeinput(Scanner scn, Node parent, boolean leftorright) {
				if (parent == null) {
					System.out.println("Enter the data for root");
				} else {
					if (leftorright) {
						System.out.println("Enter the data for left child of" + parent.val);
					} else {
						System.out.println("Enter the data for right child of" + parent.val);
					}
				}
				int cdata = scn.nextInt();
				Node child = new Node(cdata, null, null);
				this.size++;
				boolean choice = false;
				System.out.println("Do you want have left child for" + child.val);
				choice = scn.nextBoolean();
				if (choice) {
					child.left = this.takeinput(scn, child, true);
				}
				System.out.println("Do you have a right child");
				choice = scn.nextBoolean();
				if (choice) {
					child.right = this.takeinput(scn, child, false);
				}
				return child;
			}

			public void display() {
				this.display(this.root);
			}

			private void display(Node node) {
				if (node.left != null) {
					System.out.print(node.left.val + " =>");
				} else {
					System.out.print("END =>");
				}
				System.out.print(node.val + "<= ");
				if (node.right != null) {
					System.out.print(node.right.val);
				} else {
					System.out.print("END");
				}
				System.out.println();
				if (node.left != null) {
					this.display(node.left);
				}
				if (node.right != null) {
					this.display(node.right);
				}
			}

			/////////////////// New Constructor//////////

			public BinaryTree(int[] pre, int[] in) {
				// this.root = this.construct(pre, 0, pre.length - 1, in, 0, in.length -
				// 1);//for preorder
				this.root = this.construct(pre, in, 0, in.length - 1);// for
																		// postorder

			}

			private static int preIndex = 0;

			private Node construct(int[] pre, int[] in, int isi, int iei) {
				if (isi > iei) {
					return null;
				}
				Node tNode = new Node(pre[preIndex++], null, null);

				if (isi == iei) {
					return tNode;
				}

				int inIndex = search(in, isi, iei, tNode.val);
				tNode.left = construct(pre, in, isi, inIndex - 1);
				tNode.right = construct(pre, in, inIndex + 1, iei);
				return tNode;

			}

			private int search(int[] arr, int si, int ei, int data) {
				for (int i = si; i <= ei; i++) {
					if (arr[i] == data)
						return i;
				}
				return -1;
			}

			class Info {
				int size = 0;
				int max = Integer.MIN_VALUE;
				int min = Integer.MAX_VALUE;
				int ans = 0;
				boolean isbst = true;

			}

			public int largestBSTinBT() {
				return this.largestBSTinBT(this.root).ans;
			}

			//Complete this
			private Info largestBSTinBT(Node root) {
				if(root == null) {
					return new Info();
				}
				
				Info lbp = largestBSTinBT(root.left);
				Info rbp = largestBSTinBT(root.right);
				Info sbp = new Info();
				
				sbp.max = Math.max(root.val, Math.max(lbp.max, rbp.max));
				sbp.min = Math.min(root.val, Math.min(lbp.min, rbp.min));
				
				sbp.isbst = lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val;
				
				if(sbp.isbst){
					sbp.size = lbp.size + rbp.size + 1;
					sbp.ans = Math.max(lbp.ans, Math.max(rbp.ans, sbp.size));
				}
				else {
					sbp.size = 0;
					sbp.ans = Math.max(lbp.ans, rbp.ans);
				}

				return sbp;
			}

		}

		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int n = scn.nextInt();
			int[] pre = new int[n];
			int[] in = new int[n];
			for (int i = 0; i < n; i++) {
				pre[i] = scn.nextInt();
			}
			for (int i = 0; i < n; i++) {
				in[i] = scn.nextInt();
			}

			BinaryTree bt = new BinaryTree(pre, in);
//			bt.display();
			System.out.println(bt.largestBSTinBT());
		}

}
