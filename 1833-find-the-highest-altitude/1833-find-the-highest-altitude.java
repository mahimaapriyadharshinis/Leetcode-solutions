class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] arr = new int[n + 1]; // altitude array
        arr[0] = 0; // starting altitude
        int max = arr[0];

        // build prefix sums (altitudes after each gain)
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + gain[i - 1];
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
