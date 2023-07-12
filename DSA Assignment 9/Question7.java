package in.ineuron.main;
import java.util.ArrayList;
import java.util.List;

public class Question7{
    public static List<String> findPermutations(String S) {
        List<String> permutations = new ArrayList<>();
        generatePermutations(S.toCharArray(), 0, permutations);
        return permutations;
    }

    private static void generatePermutations(char[] chars, int index, List<String> permutations) {
        if (index == chars.length - 1) {
            permutations.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            generatePermutations(chars, index + 1, permutations);
            swap(chars, index, i); // Backtrack to restore the original order
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String S1 = "ABC";
        List<String> permutations1 = findPermutations(S1);
        System.out.println("Permutations of " + S1 + ": " + permutations1);

        String S2 = "XY";
        List<String> permutations2 = findPermutations(S2);
        System.out.println("Permutations of " + S2 + ": " + permutations2);
    }
}