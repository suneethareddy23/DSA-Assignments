package in.ineuron.main;

import java.util.Stack;

public class Question3 {
    TreeNode root;

    class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }
    
    Question3() {
        root = null;
    }

    void printPaths() {
        if (root == null) {
            System.out.println("The binary tree is empty.");
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();

            // Add current node to the path stack
            Stack<TreeNode> path = new Stack<>();
            path.push(current);

            // Traverse from the current node to a leaf node
            while (!stack.isEmpty() || (!path.isEmpty() && !isLeaf(path.peek()))) {
                if (current.right != null) {
                    stack.push(current.right);
                    path.push(current.right);
                }

                if (current.left != null) {
                    stack.push(current.left);
                    path.push(current.left);
                }

                if (!stack.isEmpty()) {
                    current = stack.pop();
                }
            }

            // Print the path from root to leaf
            if (isLeaf(path.peek())) {
                printPath(path);
            }
        }
    }

    boolean isLeaf(TreeNode node) {
        return (node.left == null && node.right == null);
    }

    void printPath(Stack<TreeNode> path) {
        StringBuilder sb = new StringBuilder();
        while (!path.isEmpty()) {
            sb.append(path.pop().data);
            if (!path.isEmpty()) {
                sb.append(" -> ");
            }
        }
        System.out.println(sb.toString());
    }

    
}