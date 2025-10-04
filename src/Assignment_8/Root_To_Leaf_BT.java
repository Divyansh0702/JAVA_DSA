package Assignment_8;

import java.lang.reflect.Array;
import java.util.*;

public class Root_To_Leaf_BT {
	
	Scanner scn = new Scanner(System.in);
	
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
    int size;

    public Root_To_Leaf_BT() {
        
        this.root = this.takeInput(scn, null, false);
    }

    private Node takeInput(Scanner scn, Node parent, boolean isLeft) {
        if (parent == null) {
            //System.out.println("Enter the data for root ");
        } else {
            if (isLeft) {
                //System.out.println("Enter the data for left child of " + parent.data);
            } else {
               // System.out.println("Enter the data for right child of " + parent.data);
            }
        }

        int cData = scn.nextInt();

        Node child = new Node(cData, null, null);
        this.size++;

        //System.out.println("Do you have a left child for " + child.data);
        boolean choice = scn.nextBoolean();

        if (choice) {
            child.left = this.takeInput(scn, child, true);
        }

       //  System.out.println("Do you have a right child for " + child.data);
        choice = scn.nextBoolean();

        if (choice) {
            child.right = this.takeInput(scn, child, false);
        }

        return child;
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

    @Override
    public String toString() {
        return this.toString(this.root);
    }

    private String toString(Node node) {
        if (node == null) {
            return "";
        }

        String retVal = "";

        if (node.left != null) {
            retVal += node.left.data + " => ";
        } else {
            retVal += "END" + " => ";
        }

        retVal += node.data;

        if (node.right != null) {
            retVal += " <= " + node.right.data;
        } else {
            retVal += " <= " + "END";
        }

        retVal += "\n";

        retVal += this.toString(node.left);
        retVal += this.toString(node.right);

        return retVal;
    }
    
    ArrayList<Integer> path = new ArrayList<>();

    public void rootToLeaf(int k){
    	this.rootToLeaf(root, k);
	}
	
	private void rootToLeaf(Node root, int k) {
		if(root == null) {
			return;
		}
		
		path.add(root.data);

		if(root.left == null && root.right == null && k == root.data) {
			for(int val : path) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		
		
		rootToLeaf(root.left, k - root.data);
		rootToLeaf(root.right, k - root.data);
		
		path.remove(path.size() - 1);
	}
	
 	public static void main(String[] args) {
		Root_To_Leaf_BT b1= new Root_To_Leaf_BT();
		Scanner scn = new Scanner(System.in);
		int k = scn.nextInt();
		
		b1.rootToLeaf(k);
 	}
}
