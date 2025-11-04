class Solution {
    public int removeElement(int[] nums, int val) {
        int[] arr = new int[nums.length];
        int n = nums.length;
        int c = 0; // count of valid elements
        int k = 0; // index for arr

        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                arr[k] = nums[i]; // fill compactly
                k++;
                c++;
            }
        }

        for (int i = 0; i < c; i++) {
            nums[i] = arr[i]; // only copy valid elements back
        }

        return c; // return count of remaining elements
    }
}
