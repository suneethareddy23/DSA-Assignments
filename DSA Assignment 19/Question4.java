package in.ineuron.main;
public class Question4{
    public static void moveZeroesToEnd(int[] arr) {
        int count = 0; // Count of non-zero elements

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is non-zero, swap it with the previous non-zero element
            if (arr[i] != 0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};

        System.out.println("Original Array:");
        printArray(arr);

        moveZeroesToEnd(arr);

        System.out.println("Array after moving zeroes to the end:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}