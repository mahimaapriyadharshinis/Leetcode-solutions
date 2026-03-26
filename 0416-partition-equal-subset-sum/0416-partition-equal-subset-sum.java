class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        // If sum is odd → not possible
        if (sum % 2 != 0) return false;

        int target = sum / 2;

        int n = nums.length;
        boolean[][] dp = new boolean[n + 1][target + 1];

        // Base case: sum 0 is always possible
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Fill DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {

                // Not take current element
                dp[i][j] = dp[i - 1][j];

                // Take current element (if possible)
                if (j >= nums[i - 1]) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - nums[i - 1]];
                }
            }
        }

        return dp[n][target];
    }
}