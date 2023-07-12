package in.ineuron.main;

import java.util.LinkedList;
import java.util.Queue;

class TNode {
    int data;
    TNode left, right;

    TNode(int item) {
        data = item;
        left = right = null;
    }
}

public class Question2 {
    TNode root;

    void printLeftView() {
        if (root == null)
            return;

        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int n = queue.size();

            for (int i = 1; i <= n; i++) {
                TNode node = queue.poll();

                if (i == 1)
                    System.out.print(node.data + " ");

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        Question2 tree = new Question2();
        tree.root = new TNode(4);
        tree.root.left = new TNode(5);
        tree.root.right = new TNode(2);
        tree.root.right.left = new TNode(3);
        tree.root.right.right = new TNode(1);
        tree.root.right.left.left = new TNode(6);
        tree.root.right.left.right = new TNode(7);

        System.out.println("Left View of Binary Tree:");
        tree.printLeftView();
    }
}