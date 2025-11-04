class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        // Sum the first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double max = sum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k]; // add new, remove old
            if (sum > max) max = sum;
        }

        return max / k; // return maximum average
    }
}
