package in.ineuron.main;

public class Question2 {

	class Node {
	    int data;
	    Node left, right;

	    Node(int data) {
	        this.data = data;
	        left = right = null;
	    }
	}

	public class FlipBinaryTree {
	    Node root;

	    FlipBinaryTree() {
	        root = null;
	    }

	    Node flipTree(Node node) {
	        // Base case: if the node is null or a leaf node, return the node
	        if (node == null || isLeaf(node)) {
	            return node;
	        }

	        Node flippedRoot = flipTree(node.left);

	        // Flip the connections
	        node.left.left = node.right;
	        node.left.right = node;
	        node.left = node.right = null;

	        return flippedRoot;
	    }

	    boolean isLeaf(Node node) {
	        return (node.left == null && node.right == null);
	    }

	    void printInorder(Node node) {
	        if (node == null)
	            return;

	        printInorder(node.left);
	        System.out.print(node.data + " ");
	        printInorder(node.right);
	    }
	}

	   
}