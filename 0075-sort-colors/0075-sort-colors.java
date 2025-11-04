class Solution {
    public void sortColors(int[] nums) {
        int l=nums.length;
        int n = nums.length;

        // Step 1: Find the maximum element
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] > max) max = nums[i];
        }

        // Step 2: Count occurrences
        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }

        // Step 3: Fill back the sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                nums[index++] = i;
                count[i]--;
            }
        }
        System.out.printf("[");
        for(int i=0;i<n;i++){
            System.out.printf("%d,",nums[i]);
        }
        System.out.printf("]");
    }
}