class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : arr) {
            sb.append(word);
        }
        String reversed = sb.reverse().toString();
        return s.equalsIgnoreCase(reversed);
    }
}
