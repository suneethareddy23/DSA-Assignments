package in.ineuron.main;
import java.util.LinkedList;
import java.util.Queue;

class RNode {
    int data;
    RNode left, right;

    RNode(int item) {
        data = item;
        left = right = null;
    }
}

public class Question3 {
    RNode root;

    void printRightView() {
        if (root == null)
            return;

        Queue<RNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int n = queue.size();

            for (int i = 1; i <= n; i++) {
                RNode node = queue.poll();

                if (i == n)
                    System.out.print(node.data + " ");

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
        }
    }
}