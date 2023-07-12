package in.ineuron.main;
class Node4 {
    int data;
    Node4 next, random;
	public Node4 bottom;

	Node4(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

public class Question4{
    public static Node4 copyRandomList(Node4 head) {
        if (head == null)
            return null;

        // Step 1: Insert new nodes next to the original nodes
        Node4 current = head;
        while (current != null) {
        	Node4 newNode = new Node4(current.data);
            newNode.next = current.next;
            current.next = newNode;
            current = newNode.next;
        }

        // Step 2: Set the random pointers of the new nodes
        current = head;
        while (current != null) {
            if (current.random != null)
                current.next.random = current.random.next;
            current = current.next.next;
        }

        // Step 3: Separate the original list and the new list
        current = head;
        Node4 newHead = current.next;
        while (current != null) {
        	Node4 temp = current.next;
            current.next = temp.next;
            if (temp.next != null)
                temp.next = temp.next.next;
            current = current.next;
        }

        return newHead;
    }

    public static void printList(Node4 head) {
    	Node4 current = head;
        while (current != null) {
            System.out.print("Data: " + current.data);
            if (current.random != null)
                System.out.print(", Random: " + current.random.data);
            System.out.println();
            current = current.next;
        }
    }

    public static void main(String[] args) {
        // Create the linked list
    	Node4 node1 = new Node4(1);
    	Node4 node2 = new Node4(2);
    	Node4 node3 = new Node4(3);
    	Node4 node4 = new Node4(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        node1.random = node2;
        node2.random = node4;

        // Copy the linked list
        Node4 newHead = copyRandomList(node1);

        // Print the new list
        printList(newHead);
    }
}