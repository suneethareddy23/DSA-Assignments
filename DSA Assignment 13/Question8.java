package in.ineuron.main;

class Node7 {
    int data;
    Node prev;
    Node next;

    Node7(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Question8{
    public static Node deleteNodeAtPosition(Node head, int position) {
        if (head == null) {
            return null;
        }

        if (position == 1) {
            // Update the head and return the new head
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }

        Node current = head;
        int currentPosition = 1;

        // Traverse to the desired position
        while (current != null && currentPosition < position) {
            current = current.next;
            currentPosition++;
        }

        // If the position is greater than the size of the list, return the list as it is
        if (current == null) {
            return head;
        }

        // Adjust the previous and next pointers to remove the node
        current.prev = current.next;
        if (current.next != null) {
            current.next.prev = current.prev;
        }

        return head;
    }

    public static void printDoublyLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a doubly linked list: 1 <-> 3 <-> 4
        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(4);

        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;

        Node head = node1;
        int position = 3;

        // Delete the node at the given position
        head = deleteNodeAtPosition(head, position);

        // Print the updated list
        printDoublyLinkedList(head);
    }
}