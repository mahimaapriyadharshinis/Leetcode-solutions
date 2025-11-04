import java.util.Arrays;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int x = 0;
        int y = 0;
        int prev = 0;

        Arrays.sort(nums); // ✅ sort array so duplicates are adjacent

        // find duplicate
        for (int i = 1; i < n; i++) {
            prev = nums[i - 1];
            int cur = nums[i];
            if (prev == cur) {
                x = prev;
            }
        }

        // compute missing number
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int expectedSum = n * (n + 1) / 2;
        y = expectedSum - (sum - x);

        int[] ans = new int[2];
        ans[0] = x;
        ans[1] = y;
        return ans;
    }
}
