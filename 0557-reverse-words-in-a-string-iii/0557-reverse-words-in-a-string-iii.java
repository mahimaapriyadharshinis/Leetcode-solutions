class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        int n = arr.length;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            result.append(sb);
            if (i < n - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}