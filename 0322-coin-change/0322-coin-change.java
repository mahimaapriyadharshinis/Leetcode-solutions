class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];

        // manually initialize
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1; // big value (like infinity)
        }

        // main logic
        for (int i = 1; i <= amount; i++) {

            for (int j = 0; j < coins.length; j++) {

                if (coins[j] <= i) {

                    int remaining = i - coins[j];
                    int result = dp[remaining] + 1;

                    if (result < dp[i]) {
                        dp[i] = result;
                    }
                }
            }
        }

        // check if possible
        if (dp[amount] > amount) {
            return -1;
        }

        return dp[amount];
    }
}