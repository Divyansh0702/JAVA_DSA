package Assignment_8;

import java.util.*;

public class Replace_With_Sum_BST {
	
	static private class BinaryTree{
		private class Node {
	        int data;
	        Node left;
	        Node right;

	        Node(int data, Node left, Node right) {
	            this.data = data;
	            this.left = left;
	            this.right = right;
	        }
	    }

	    private Node root;
	    private int size;

	    public BinaryTree() {
	        this.root = null;
	    }

	    
	    public void add(int data) {
	    	if(root == null) {
	    		root = new Node(data, null, null);
	    	}
	    	else {
	    		add(root, data);
	    	}
	    }
	    
	    private void add(Node root, int data) {
	    	if(data < root.data) {
	    		if(root.left != null) {
	    			add(root.left, data);
	    		}
	    		else {
	    			root.left = new Node(data, null, null);
	    		}
	    	}
	    	if(data > root.data) {
	    		if(root.right != null) {
	    			add(root.right, data);
	    		}
	    		else {
	    			root.right = new Node(data, null, null);
	    		}
	    	}
	    }

	    public void remove(int data) {
	        this.root = this.remove(this.root, data);
	    }

	    private Node remove(Node node, int data) {
	        if (node == null) {
	            return null;
	        }

	        if (data > node.data) {
	            node.right = this.remove(node.right, data);
	            return node;
	        } 
	        else if (data < node.data) {
	            node.left = this.remove(node.left, data);
	            return node;
	        }
	        else {
	            if (node.left == null && node.right == null) {
	                this.size--;
	                return null;
	            } else if (node.left == null) {
	                this.size--;
	                return node.right;
	            } else if (node.right == null) {
	                this.size--;
	                return node.left;
	            } else {
	                int lmax = this.max(node.left);
	                node.data = lmax;
	                node.left = this.remove(node.left, lmax);

	                return node;
	            }
	        }
	    }

	    public int size() {
	        return this.size;
	    }

	    public boolean isEmpty() {
	        return this.size() == 0;
	    }

	    public void display() {
	        System.out.println(this);
	    }

	    public int max() {
	        return this.max(this.root);
	    }

	    private int max(Node node) {
	        int rv = node.data;

	        if (node.right != null) {
	            rv = this.max(node.right);
	        }

	        return rv;
	    }

	    @Override
	    public String toString() {
	    	return toString(root);
	    }
	    
	    private String toString(Node root) {
	    	if(root == null) {
	    		return "";
	    	}
	    	String str = " " + root.data + " ";
	    	
	    	if(root.left != null) {
	    		str = root.left.data + " =>" + str;
	    	}
	    	else {
	    		str = "END =>" + str;
	    	}
	    	
	    	if(root.right != null) {
	    		str = str + "<= " + root.right.data;
	    	}
	    	else {
	    		str = str + "<= END";
	    	}
	    	
	    	str += "\n";
	    		
	    	str += toString(root.left);
	    	str += toString(root.right);
	    	
	    	return str;
	    	
	    }
	    
	    private int sum = 0;
	    
	    public void replaceWLS() {
	    	replaceWLS(this.root);
	    }
	    
	    private void replaceWLS(Node root) {
	        if(root == null) {
	        	return;
	        }
	        
	        replaceWLS(root.right);
	        int original = root.data;
	        root.data = sum;
	        sum += original;
	        replaceWLS(root.left);
	   
	    }
	}
    
    public static void main(String[] args) {
        BinaryTree bt= new BinaryTree();
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n != 0){
        	int m = scn.nextInt();
        	bt.add(m);
        	--n;
        }
        
        bt.replaceWLS();

        System.out.println(bt);
    }
}
