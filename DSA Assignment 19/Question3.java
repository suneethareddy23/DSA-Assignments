package in.ineuron.main;
public class Question3 {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] leftArray = new int[mid - left + 1];
        int[] rightArray = new int[right - mid];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = nums[left + i];
        }

        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = nums[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                nums[k] = leftArray[i];
                i++;
            } else {
                nums[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArray.length) {
            nums[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArray.length) {
            nums[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Question3 sorter = new Question3();

        // Example usage:
        int[] nums = {5, 2, 3, 1};
        int[] sortedNums = sorter.sortArray(nums);

        for (int num : sortedNums) {
            System.out.print(num + " ");
        }
    }
}