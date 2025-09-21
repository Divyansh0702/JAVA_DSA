package Assignment_8;

import  java.util.*;

public class ArrayList_Levels_BT {
	
	static Scanner sc = new Scanner(System.in);
	
	static private class BinaryTree{
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
		
		public List<List<Integer>> Level(){
			List<List<Integer>> res = new ArrayList<>();
			
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			
			while(!q.isEmpty()) {
				int size = q.size();
				List<Integer> level = new ArrayList<Integer>();
				
				for(int i = 0; i < size; i++) {
					Node rv = q.poll();
					level.add(rv.val);
					
					if(rv.left != null) q.add(rv.left);
					if(rv.right != null) q.add(rv.right);
				}
				res.add(level);
			}
			return res;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt1 = new BinaryTree();
		
		System.out.println(bt1.Level());
	}
//	50 true 12 true 18 false false true 13 false false false
	
}
