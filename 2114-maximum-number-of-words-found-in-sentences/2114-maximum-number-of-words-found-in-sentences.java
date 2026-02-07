class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            int len = words.length;

            if (len > max) {
                max = len;
            }
        }

        return max;
    }
}