class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int zeroCount = 0;
        int totalProduct = 1;

        // Step 1: count zeros and multiply non-zero numbers
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                totalProduct *= num;
            }
        }

        // Step 2: fill the ans array based on zero count
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                ans[i] = 0; // more than 1 zero → all products are 0
            } else if (zeroCount == 1) {
                ans[i] = (nums[i] == 0) ? totalProduct : 0;
            } else {
                ans[i] = totalProduct / nums[i]; // no zeros → divide total product
            }
        }

        return ans;
    }
}
