package in.ineuron.main;
class Node {
    int data;
    Node next;
	public Object prev;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question1 {
    public static Node createNewLinkedList(Node list1, Node list2) {
        if (list1 == null || list2 == null) {
            return null;
        }

        Node head = new Node(0);  // Head node of the new linked list
        Node current = head;

        while (list1 != null && list2 != null) {
            if (list1.data >= list2.data) {
                current.next = new Node(list1.data);
                list1 = list1.next;
            } else {
                current.next = new Node(list2.data);
                list2 = list2.next;
            }
            current = current.next;
        }

        // Append the remaining nodes of list1, if any
        while (list1 != null) {
            current.next = new Node(list1.data);
            list1 = list1.next;
            current = current.next;
        }

        // Append the remaining nodes of list2, if any
        while (list2 != null) {
            current.next = new Node(list2.data);
            list2 = list2.next;
            current = current.next;
        }

        return head.next;
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
       
        Node node1 = new Node(5);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(8);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Node list1 = node1;

        Node node5 = new Node(1);
        Node node6 = new Node(7);
        Node node7 = new Node(4);
        Node node8 = new Node(5);

        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

        Node list2 = node5;

       
        Node newList = createNewLinkedList(list1, list2);

     
        printLinkedList(newList);
    }
}