package in.ineuron.main;
public class Question7 {
    public static void printPermutations(String str) {
        int n = str.length();
        char[] chars = str.toCharArray();
        permute(chars, 0, n - 1);
    }

    private static void permute(char[] chars, int left, int right) {
        if (left == right) {
            System.out.println(new String(chars));
        } else {
            for (int i = left; i <= right; i++) {
                swap(chars, left, i);
                permute(chars, left + 1, right);
                swap(chars, left, i);
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String str1 = "cd";
        System.out.println("Permutations of " + str1 + ":");
        printPermutations(str1);

        String str2 = "abb";
        System.out.println("Permutations of " + str2 + ":");
        printPermutations(str2);
    }
}