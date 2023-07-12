package in.ineuron.main;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Question6 {
    public int[] deckRevealedIncreasing(int[] deck) {
        // Sort the deck array in descending order
        Arrays.sort(deck);
        int n = deck.length;

        // Initialize a deque to store the revealed cards
        Deque<Integer> result = new LinkedList<>();

        // Iterate through the sorted deck array
        for (int i = n - 1; i >= 0; i--) {
            if (!result.isEmpty()) {
                // Move the last element from result to the front
                result.addFirst(result.removeLast());
            }
            // Add the current element to the front of result
            result.addFirst(deck[i]);
        }

        // Convert the deque to an array
        int[] orderedDeck = new int[n];
        int i = 0;
        for (int card : result) {
            orderedDeck[i++] = card;
        }

        return orderedDeck;
    }

    public static void main(String[] args) {
        Question6 cardOrder = new Question6();

        int[] deck1 = {17, 13, 11, 2, 3, 5, 7};
        int[] result1 = cardOrder.deckRevealedIncreasing(deck1);
        System.out.println(Arrays.toString(result1));  // Output: [2, 13, 3, 11, 5, 17, 7]

        int[] deck2 = {1, 2, 3, 4, 5};
        int[] result2 = cardOrder.deckRevealedIncreasing(deck2);
        System.out.println(Arrays.toString(result2));  // Output: [1, 5, 2, 4, 3]
    }
}