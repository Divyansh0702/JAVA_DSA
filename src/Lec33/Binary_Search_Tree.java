package Lec33;

public class Binary_Search_Tree {
	
	class Node{
		int val;
		Node left;
		Node right;
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	private Node root;
	
	public Binary_Search_Tree(int[] arr) {
		root = CreateTree(arr, 0, arr.length - 1);
	}
	
	private Node CreateTree(int[] arr, int start, int end) {
		if(start > end) {
			return null;
		}
		
		int mid = (start + end) / 2;
		Node nn = new Node(arr[mid]);
		
		nn.left = CreateTree(arr, start, mid - 1);
		nn.right = CreateTree(arr, mid + 1, end);
		return nn;
	}
	
	
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
	
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
		Binary_Search_Tree bst = new Binary_Search_Tree(arr);
		bst.Display();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	class Node{
//		int val;
//		Node left;
//		Node right;
//	}
//	
//	private Node root;
//	
//	public Binary_Search_Tree(int[] in) {
//		root = createTree(in, 0, in.length-1);
//	}
//	
//	private Node createTree(int[] in, int lo, int hi) {
//		if(lo > hi) {
//			return null;
//		}
//		int mid = (lo + hi) / 2;
//		Node nn = new Node();
//		nn.val = in[mid];
//		nn.left = createTree(in, lo, mid-1);
//		nn.right = createTree(in, mid+1, hi);
//		return nn;
//	}
}
