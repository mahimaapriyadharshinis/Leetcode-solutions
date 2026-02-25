class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;

        // take all k from left first
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }

        int max = sum;
        int right = n - 1;

        // replace left picks with right picks
        for (int i = k - 1; i >= 0; i--) {
            sum -= cardPoints[i];
            sum += cardPoints[right];
            right--;
            max = Math.max(max, sum);
        }

        return max;
    }
}