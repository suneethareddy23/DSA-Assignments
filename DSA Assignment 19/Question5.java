package in.ineuron.main;
public class Question5{
    public static void rearrangeArray(int[] arr) {
        int n = arr.length;

        int i = -1;
        for (int j = 0; j < n; j++) {
            if (arr[j] < 0) {
                i++;
                swap(arr, i, j);
            }
        }

        int pos = i + 1;
        int neg = 0;

        while (pos < n && neg < pos && arr[neg] < 0) {
            swap(arr, neg, pos);
            pos++;
            neg += 2;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};

        System.out.println("Original Array:");
        printArray(arr);

        rearrangeArray(arr);

        System.out.println("Array after rearranging in alternating fashion:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}