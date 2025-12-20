import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        // Step 1: Sort the array
        Arrays.sort(nums);

        int longest = 1;
        int count = 1;

        // Step 2: Traverse and count
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue; // skip duplicates
            } else if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                longest = Math.max(longest, count);
                count = 1;
            }
        }

        return Math.max(longest, count);
    }
}
