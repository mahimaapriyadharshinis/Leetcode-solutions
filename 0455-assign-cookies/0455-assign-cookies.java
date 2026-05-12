import java.util.Arrays;

class Solution {

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // child pointer
        int j = 0; // cookie pointer

        while(i < g.length && j < s.length) {

            // Cookie can satisfy child
            if(s[j] >= g[i]) {
                i++;
            }

            // Move to next cookie
            j++;
        }

        return i;
    }
}