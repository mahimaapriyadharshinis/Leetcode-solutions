class Solution {
    public int maxProfit(int[] prices) {
        int l = prices.length;
        if (l == 0) return 0;              // handle empty input

        int minval = prices[0];
        int minindex = 0;
        int max = prices[0];
        int maxindex = 0;
        int profit = 0;                    // track best profit

        // single pass: update minval and profit on the fly
        for (int i = 0; i < l; i++) {
            if (prices[i] < minval) {      // found a new minimum
                minval = prices[i];
                minindex = i;
                max = prices[i];           // reset max after new minimum
                maxindex = i;
            }
            if (prices[i] > max) {         // track max after current min
                max = prices[i];
                maxindex = i;
            }
            // update best profit so far
            if (max - minval > profit) {
                profit = max - minval;
            }
        }
        return profit;
    }
}
