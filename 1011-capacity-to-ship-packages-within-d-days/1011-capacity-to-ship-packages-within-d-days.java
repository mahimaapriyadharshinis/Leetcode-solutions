class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        // low = max weight, high = sum of weights
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        // Binary search on answer
        while (low < high) {
            int mid = low + (high - low) / 2;

            int neededDays = 1;
            int currentLoad = 0;

            for (int w : weights) {
                if (currentLoad + w > mid) {
                    neededDays++;
                    currentLoad = 0;
                }
                currentLoad += w;
            }

            if (neededDays <= days) {
                high = mid;   // try smaller capacity
            } else {
                low = mid + 1; // need bigger capacity
            }
        }

        return low;
    }
}