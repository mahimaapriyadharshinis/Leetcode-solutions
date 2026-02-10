class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        } else if (x < 4 && x >= 1) {
            return 1;
        }

        for (int i = 1; i <= x; i++) {
            long a = (long) i * i;
            long b = (long) (i + 1) * (i + 1);

            if (a <= x && b > x) {
                return i;
            }
        }
        return 0;
    }
}