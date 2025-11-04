class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] sum1 = new int[n]; // prefix sum
        int[] sum2 = new int[n]; // suffix sum

        // build prefix sum
        sum1[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sum1[i] = sum1[i - 1] + nums[i];
        }

        // build suffix sum
        sum2[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sum2[i] = sum2[i + 1] + nums[i];
        }

        // check pivot
        for (int i = 0; i < n; i++) {
            int leftSum = (i == 0) ? 0 : sum1[i - 1];
            int rightSum = (i == n - 1) ? 0 : sum2[i + 1];
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}
