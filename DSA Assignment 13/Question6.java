package in.ineuron.main;
class Node5 {
    int data;
    Node next;

    Node5(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question6{
    public static Node mergeSortedLists(Node head1, Node head2) {
        // Create a dummy node as the head of the merged list
        Node dummy = new Node(0);
        Node current = dummy;

        // Traverse both lists and compare the nodes
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        // If there are remaining nodes in either list, append them to the merged list
        if (head1 != null) {
            current.next = head1;
        }
        if (head2 != null) {
            current.next = head2;
        }

        return dummy.next; // Return the head of the merged list
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
        // Create linked list a: 5 -> 10 -> 15
        Node a1 = new Node(5);
        Node a2 = new Node(10);
        Node a3 = new Node(15);

        a1.next = a2;
        a2.next = a3;

        Node head1 = a1;

        // Create linked list b: 2 -> 3 -> 20
        Node b1 = new Node(2);
        Node b2 = new Node(3);
        Node b3 = new Node(20);

        b1.next = b2;
        b2.next = b3;

        Node head2 = b1;

        // Merge the sorted linked lists
        Node mergedHead = mergeSortedLists(head1, head2);

        // Print the merged list
        printLinkedList(mergedHead);
    }
}



