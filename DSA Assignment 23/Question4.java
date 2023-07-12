package in.ineuron.main;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
public class Question4 {
    Node root;

    void printBottomView() {
        if (root == null)
            return;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<NodeWithHD> queue = new LinkedList<>();
        queue.add(new NodeWithHD(root, 0));

        while (!queue.isEmpty()) {
            NodeWithHD temp = queue.poll();
            int hd = temp.hd;
            Node node = temp.node;

            map.put(hd, node.data);

            if (node.left != null)
                queue.add(new NodeWithHD(node.left, hd - 1));
            if (node.right != null)
                queue.add(new NodeWithHD(node.right, hd + 1));
        }

        for (int value : map.values()) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        Question4 tree = new Question4();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(25);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);

        System.out.println("Bottom View of Binary Tree:");
        tree.printBottomView();
    }
}

class NodeWithHD {
    Node node;
    int hd;

    NodeWithHD(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}