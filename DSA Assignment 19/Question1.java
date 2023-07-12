package in.ineuron.main;
import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Question1 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Insert the head nodes of all linked lists into the min-heap
        for (ListNode headNode : lists) {
            if (headNode != null) {
                minHeap.offer(headNode);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll(); // Remove the minimum element

            curr.next = node; // Append the node to the merged list
            curr = curr.next;

            if (node.next != null) {
                minHeap.offer(node.next); // Insert the next node from the same linked list
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
      Question1 merger = new Question1();

        // Example usage:
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);

        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);

        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);

        ListNode mergedList = merger.mergeKLists(lists);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
        // Output: 1 1 2 3 4 4 5 6
    }
}