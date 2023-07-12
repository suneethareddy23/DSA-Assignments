package in.ineuron.main;
public class Question8 {
    public static int getProduct(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Product: " + getProduct(arr1));  // Output: 120

        int[] arr2 = {1, 6, 3};
        System.out.println("Product: " + getProduct(arr2));  // Output: 18
    }
}