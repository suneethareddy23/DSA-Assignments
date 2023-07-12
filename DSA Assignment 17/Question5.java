package in.ineuron.main;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Question5{
    public int findTheWinner(int n, int k) {
        // Create a circular linked list
        ListNode head = new ListNode(1);
        ListNode prev = head;
        for (int i = 2; i <= n; i++) {
            ListNode newNode = new ListNode(i);
            prev.next = newNode;
            prev = newNode;
        }
        prev.next = head;

        // Play the game until one friend remains
        while (head.next != head) {
            // Move k-1 friends in clockwise direction
            for (int i = 0; i < k - 1; i++) {
                head = head.next;
            }

            // Remove the kth friend from the circle
            head.next = head.next.next;
        }

        // Return the friend number of the last remaining friend
        return head.val;
    }

    public static void main(String[] args) {
      Question5 game = new Question5();

        System.out.println(game.findTheWinner(5, 2));  // Output: 3
        System.out.println(game.findTheWinner(6, 4));  // Output: 5
    }
}