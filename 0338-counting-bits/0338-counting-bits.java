class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            String binary = Integer.toBinaryString(i);
            char[] arr = binary.toCharArray();

            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == '1') {
                    c++;
                }
            }
            ans[i] = c;
        }
        return ans;
    }
}