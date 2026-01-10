class Solution {
    public boolean checkIfPangram(String sentence) {
        StringBuilder sb = new StringBuilder(sentence);
        String[] parts = sb.toString().split(" ");
        Arrays.sort(parts);
        String all = String.join("", parts).toLowerCase();
        boolean containsAll = true;
        for (char c = 'a'; c <= 'z'; c++) {
            if (all.indexOf(c) == -1) {
                containsAll = false;
                break;
            }
        }
        return containsAll;
    }
}
