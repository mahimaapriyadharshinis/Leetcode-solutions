class Solution {
    public int arraySign(int[] nums) {
        int l = nums.length;
        int p = 1;
        for (int i = 0; i < l; i++) {
            if (nums[i] == 0) return 0;
            if (nums[i] < 0) p = -p;
        }
        return p;
    }
}
