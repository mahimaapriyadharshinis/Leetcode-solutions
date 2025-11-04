class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
        int c = 0;

        // iterate over the whole flowerbed, not just n
        for (int i = 0; i < l; i++) {
            // check current plot and its immediate neighbours
            if (flowerbed[i] == 0) {
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                int next = (i == l - 1) ? 0 : flowerbed[i + 1];

                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1;   // place a flower
                    c++;
                }
            }
        }

        // need at least n flowers placed
        if (c >= n) {
            return true;
        } else {
            return false;
        }
    }
}
