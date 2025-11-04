class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            int m = Math.min(height[i], height[j]);   // take min height
            int ma = m * (j - i);                     // calculate area
            if (ma > max) {
                max = ma;
            }

            // move the pointer at smaller height
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}
