class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        String[] words = str.split("\\s+");
        int n = words.length;
        String[] ans = new String[n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = words[n - 1 - i].trim(); // reverse words
        }
        
        // Join reversed words into a sentence
        String sentence = String.join(" ", ans);
        return sentence;
    }
}
