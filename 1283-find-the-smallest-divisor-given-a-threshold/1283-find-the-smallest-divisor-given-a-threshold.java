class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;

        for (int x : nums) {
            right = Math.max(right, x);
        }

        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += (int) Math.ceil((double) nums[i] / mid);
            }

            if (sum <= threshold) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}