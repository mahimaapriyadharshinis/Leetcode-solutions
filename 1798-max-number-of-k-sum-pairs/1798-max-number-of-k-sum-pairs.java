import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        int c = 0;
        Arrays.sort(nums); // sort first
        int i = 0, j = n - 1;

        while (i < j) {
            int sum = nums[i] + nums[j]; 
            if (sum == k) {
                c++;
                i++;
                j--;
            } else if (sum < k) {
                i++;
            } else {
                j--;
            }
        }
        return c;
    }
}
