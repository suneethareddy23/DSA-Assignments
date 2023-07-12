package in.ineuron.main;

class Node3 {
    int data;
    Node3 next;
    Node3 bottom;

    Node3(int data) {
        this.data = data;
        this.next = null;
        this.bottom = null;
    }
}

public class Question3 {
    public static Node3 mergeLists(Node3 a, Node3 b) {
        if (a == null)
            return b;
        if (b == null)
            return a;

        Node3 result;
        if (a.data <= b.data) {
            result = a;
            result.bottom = mergeLists(a.bottom, b);
        } else {
            result = b;
            result.bottom = mergeLists(a, b.bottom);
        }

        return result;
    }

    public static Node3 flattenLinkedList(Node3 head) {
        if (head == null || head.next == null)
            return head;

        // Merge the current node's list with the flattened list obtained so far
        head.next = flattenLinkedList(head.next);
        head = mergeLists(head, head.next);

        return head;
    }

    public static void printFlattenedList(Node3 head) {
    	Node3 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.bottom;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create the linked list with sub-linked lists
    	Node3 node1 = new Node3(5);
    	Node3 node2 = new Node3(10);
    	Node3 node3 = new Node3(19);
    	Node3 node4 = new Node3(28);
    	Node3 node5 = new Node3(7);
    	Node3 node6 = new Node3(20);
    	Node3 node7 = new Node3(22);
    	Node3 node8 = new Node3(35);
    	Node3 node9 = new Node3(8);
    	Node3 node10 = new Node3(50);
    	Node3 node11 = new Node3(40);
    	Node3 node12 = new Node3(30);
    	Node3 node13 = new Node3(45);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node1.bottom = node5;
        node2.bottom = node6;
        node3.bottom = node7;
        node4.bottom = node8;
        node5.bottom = node9;
        node6.bottom = node10;
        node7.bottom = node11;
        node9.bottom = node12;
        node11.bottom = node13;

        Node3 head = node1;

        // Flatten the linked list
        head = flattenLinkedList(head);

        // Print the flattened list
        printFlattenedList(head);
    }
}