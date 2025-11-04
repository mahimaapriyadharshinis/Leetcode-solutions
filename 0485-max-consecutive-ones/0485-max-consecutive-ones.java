class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int c1 = 0; // max consecutive

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                int c = 0;
                // count consecutive 1s from this position
                while (i < n && nums[i] == 1) {
                    c++;
                    i++; // move forward inside while
                }
                if (c > c1) {
                    c1 = c;
                }
            }
        }
        return c1;
    }
}
