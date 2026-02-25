class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if (k == n) return "0";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = num.charAt(i);

            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) > c) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }

            sb.append(c);
        }

        // If still need to remove digits, remove from the end
        while (k > 0 && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        // Remove leading zeros
        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }

        String result = sb.substring(i);

        if (result.length() == 0) return "0";
        return result;
    }
}