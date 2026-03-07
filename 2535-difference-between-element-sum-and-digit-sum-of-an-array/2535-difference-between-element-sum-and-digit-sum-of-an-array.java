class Solution {
    public int differenceOfSum(int[] nums) {
        int l = nums.length;
        int a = 0;
        int b = 0;
        for (int i = 0; i < l; i++) {
            a = a + nums[i];
        }
        for (int i = 0; i < l; i++) {
            String s = Integer.toString(nums[i]);
            String[] arr = s.split("");
            for (int j = 0; j < arr.length; j++) { 
                b += Integer.parseInt(arr[j]);
            }
        }
        return Math.abs(a - b);
    }
}