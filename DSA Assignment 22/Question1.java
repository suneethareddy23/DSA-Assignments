package in.ineuron.main;

public class Question1 {
	class Node {
	    int data;
	    Node left, right;

	    Node(int data) {
	        this.data = data;
	        left = right = null;
	    }
	}

	public class BinaryTreeToDLL {
	    Node root;
	    Node prev; // Keeps track of the previously visited node

	    BinaryTreeToDLL() {
	        root = null;
	        prev = null;
	    }

	    void convertToDLL(Node node) {
	        if (node == null)
	            return;

	        convertToDLL(node.left);

	        if (prev == null) {
	            root = node;
	        } else {
	            prev.right = node;
	            // Set the current node's left pointer to the previous node
	            node.left = prev;
	        }

	        prev = node; // Update the previous node

	        convertToDLL(node.right);
	    }
	}

}