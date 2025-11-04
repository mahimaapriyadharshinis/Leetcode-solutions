class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0) return "";

        StringBuilder sb = new StringBuilder(strs[0]);
        String ans = "";

        for (int i = 0; i <= sb.length(); i++) {
            String sub = sb.substring(0, i);
            int c = 0;

            for (int j = 0; j < n; j++) {
                if (strs[j].startsWith(sub)) {
                    c++;
                } else {
                    break;
                }
            }

            if (c == n) {
                ans = sub;
            } else {
                break; // stop early when mismatch found
            }
        }
        return ans;
    }
}
