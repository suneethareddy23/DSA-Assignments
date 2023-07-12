package in.ineuron.main;

public class Question5{
    public static int findMaxElement(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int maxSoFar = findMaxElement(arr, index + 1);
        return Math.max(arr[index], maxSoFar);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 3, -5, -4, 8, 6};
        System.out.println("Maximum element: " + findMaxElement(arr1, 0));  // Output: 8

        int[] arr2 = {1, 4, 45, 6, 10, -8};
        System.out.println("Maximum element: " + findMaxElement(arr2, 0));  // Output: 45
    }
}
