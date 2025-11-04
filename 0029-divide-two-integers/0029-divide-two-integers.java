class Solution {
    public int divide(int dividend, int divisor) {
        double n=dividend/divisor;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int p=(int)n;
        return p;
    }
}