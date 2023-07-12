package in.ineuron.main;
import java.util.Arrays;

 class Solution182 {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int minValue = Arrays.stream(nums).min().getAsInt();
        int maxValue = Arrays.stream(nums).max().getAsInt();
        int n = nums.length;

        int bucketSize = Math.max(1, (maxValue - minValue) / (n - 1));
        int numBuckets = (maxValue - minValue) / bucketSize + 1;

        int[] minBucket = new int[numBuckets];
        int[] maxBucket = new int[numBuckets];
        Arrays.fill(minBucket, Integer.MAX_VALUE);
        Arrays.fill(maxBucket, Integer.MIN_VALUE);

        for (int num : nums) {
            int bucketIdx = (num - minValue) / bucketSize;
            minBucket[bucketIdx] = Math.min(minBucket[bucketIdx], num);
            maxBucket[bucketIdx] = Math.max(maxBucket[bucketIdx], num);
        }

        int maxGap = 0;
        int prevMax = minValue;

        for (int i = 0; i < numBuckets; i++) {
            if (minBucket[i] != Integer.MAX_VALUE) {
                maxGap = Math.max(maxGap, minBucket[i] - prevMax);
                prevMax = maxBucket[i];
            }
        }

        return maxGap;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Solution182 solution = new Solution182();

        int[] nums1 = {3, 6, 9, 1};
        int maxGap1 = solution.maximumGap(nums1);
        System.out.println(maxGap1);
        // Output: 3

        int[] nums2 = {10};
        int maxGap2 = solution.maximumGap(nums2);
        System.out.println(maxGap2);
        // Output: 0
    }
}