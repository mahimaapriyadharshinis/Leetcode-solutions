class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Move all non-zero numbers forward
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Fill rest with zeros
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
