class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;                    // adjust for 1-based indexing
            int rem = columnNumber % 26;       // 0 to 25
            char ch = (char) ('A' + rem);      // convert to letter
            sb.append(ch);
            columnNumber = columnNumber / 26;
        }

        return sb.reverse().toString();
    }
}
