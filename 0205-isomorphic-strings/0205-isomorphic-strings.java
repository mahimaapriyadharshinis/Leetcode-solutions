import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] arr1 = new int[256];
        int[] arr2 = new int[256];

        Arrays.fill(arr1, -1);
        Arrays.fill(arr2, -1);

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If last seen positions don't match, pattern is different
            if (arr1[c1] != arr2[c2]) {
                return false;
            }

            // Update last seen position
            arr1[c1] = i;
            arr2[c2] = i;
        }
        return true;
    }
}