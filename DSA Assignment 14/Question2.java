package in.ineuron.main;
class Node2{
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question2 {
    public static Node2 reverseLinkedList(Node2 head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node2 prev = null;
        Node2 current = head;
        Node2 next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static Node2 addOneToLinkedList(Node2 head) {
        head = reverseLinkedList(head);

        Node2 current = head;
        int carry = 1;

        while (current != null) {
            int sum = current.data + carry;
            carry = sum / 10;
            current.data = sum % 10;
            if (carry == 0) {
                break;
            }
            current = current.next;
        }

        if (carry == 1) {
            Node2 newHead = new Node2(1);
            newHead.next = head;
            head = newHead;
        }

        return reverseLinkedList(head);
    }

    public static void printLinkedList(Node2 head) {
        Node2 current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a linked list representing the number 4 -> 5 -> 6
        Node2 node1 = new Node2(4);
        Node2 node2 = new Node2(5);
        Node2 node3 = new Node2(6);

        node1.next = node2;
        node2.next = node3;

        Node2 head = node1;

        // Add 1 to the linked list
        head = addOneToLinkedList(head);

        // Print the updated list
        printLinkedList(head);
    }
}