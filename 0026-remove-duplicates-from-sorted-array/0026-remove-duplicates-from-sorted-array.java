class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int c = 1; // count of unique elements
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[c] = nums[i + 1]; // place unique element
                c++;
            }
        }
        return c; // return count of unique elements
    }
}
