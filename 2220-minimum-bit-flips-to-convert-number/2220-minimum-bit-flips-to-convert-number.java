class Solution {
    public int minBitFlips(int start, int goal) {
        
        String b1 = Integer.toBinaryString(start);
        String b2 = Integer.toBinaryString(goal);

        int l1 = b1.length();
        int l2 = b2.length();
        int l = 0;

        if (l1 == l2) {
            l = l1;
        } else {
            l = (l1 < l2) ? l1 : l2;
        }

        int c = 0;

        // compare from the right (LSB side)
        int i = l1 - 1;
        int j = l2 - 1;

        while (i >= 0 && j >= 0) {
            if (b1.charAt(i) != b2.charAt(j)) {
                c++;
            }
            i--;
            j--;
        }
        while (i >= 0) {
            if (b1.charAt(i) == '1') c++;
            i--;
        }

        while (j >= 0) {
            if (b2.charAt(j) == '1') c++;
            j--;
        }

        return c;
    }
}