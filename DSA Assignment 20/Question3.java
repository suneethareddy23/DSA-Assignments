package in.ineuron.main;

public class Question3 {

	public static String isLevelOrderBST(int[] arr) {
        int n = arr.length;
        int i = 1;

        while (i < n && arr[i] < arr[i - 1]) {
            i++;
        }

        for (int j = i; j < n; j++) {
            if (arr[j] < arr[i - 1]) {
                return "No";
            }
        }

        return "Yes";
    }

    public static void main(String[] args) {
       
        int[] arr2 = {11, 6, 13, 5, 12, 10};
        System.out.println("Output2: " + isLevelOrderBST(arr2));
    }
}