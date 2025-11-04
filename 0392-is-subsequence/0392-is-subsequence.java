class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();

        char[] a = new char[n1];
        char[] b = new char[n2];

        
        for (int i = 0; i < n1; i++) a[i] = s.charAt(i);
        for (int i = 0; i < n2; i++) b[i] = t.charAt(i);

        int i = 0;
        for (int j = 0; j < n2 && i < n1; j++) {
            if (a[i] == b[j]) i++;
        }

        return i == n1; // true if all characters of s matched in order
    }
}
