import java.util.*;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb1 = new StringBuilder(word1);
        StringBuilder sb2 = new StringBuilder(word2);
        StringBuilder sb  = new StringBuilder();
        
        int n1 = word1.length();
        int n2 = word2.length();
        int n  = (n1 > n2) ? n1 : n2;

        for (int i = 0; i < n; i++) {
            if (i < n1) sb.append(sb1.charAt(i));   // add from word1 only if i in range
            if (i < n2) sb.append(sb2.charAt(i));   // add from word2 only if i in range
        }

        return sb.toString();
    }
}
