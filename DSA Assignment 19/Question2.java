package in.ineuron.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NumberIndex {
    int number;
    int index;

    NumberIndex(int number, int index) {
        this.number = number;
        this.index = index;
    }
}

public class Question2 {
    public List<Integer> countSmaller(int[] nums) {
        int[] counts = new int[nums.length];
        NumberIndex[] numIndices = new NumberIndex[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numIndices[i] = new NumberIndex(nums[i], i);
        }

        mergeSort(numIndices, counts);

        List<Integer> result = new ArrayList<>();
        for (int count : counts) {
            result.add(count);
        }
        return result;
    }

    private void mergeSort(NumberIndex[] numIndices, int[] counts) {
        if (numIndices.length <= 1) {
            return;
        }

        int mid = numIndices.length / 2;
        NumberIndex[] left = Arrays.copyOfRange(numIndices, 0, mid);
        NumberIndex[] right = Arrays.copyOfRange(numIndices, mid, numIndices.length);

        mergeSort(left, counts);
        mergeSort(right, counts);

        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].number <= right[j].number) {
                numIndices[k] = left[i];
                counts[left[i].index] += j; // Count the smaller elements in the right half
                i++;
            } else {
                numIndices[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            numIndices[k] = left[i];
            counts[left[i].index] += j; // Count the remaining smaller elements in the right half
            i++;
            k++;
        }

        while (j < right.length) {
            numIndices[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Question2 counter = new Question2();

        // Example usage:
        int[] nums = {5, 2, 6, 1};
        List<Integer> counts = counter.countSmaller(nums);

        System.out.println(counts); // Output: [2, 1, 1, 0]
    }
}