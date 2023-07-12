package in.ineuron.main;
class Node2 {
    int data;
    Node next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question3 {
    public static Node reverseKNodes(Node head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        int count = 0;
        Node current = head;
        Node prev = null;
        Node next = null;

        // Reverse the first k nodes
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // If there are remaining nodes, recursively reverse them as well
        if (next != null) {
            head.next = reverseKNodes(next, k);
        }

        return prev;
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 2 -> 4 -> 5 -> 6 -> 7 -> 8 -> null
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(2);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

        Node head = node1;

        int k = 4;

        // Reverse every k nodes in the linked list
        head = reverseKNodes(head, k);

        // Print the updated linked list
        printLinkedList(head);
    }
}