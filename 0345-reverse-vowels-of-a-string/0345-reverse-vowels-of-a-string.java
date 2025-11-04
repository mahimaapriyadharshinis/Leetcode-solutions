class Solution {
    public String reverseVowels(String s) {
        int l = s.length();
        char[] arr = new char[l];  // changed from int[] to char[]
        int flag = 0;
        int no = 0;
        StringBuilder sb = new StringBuilder(s);

        // Collect vowels
        for (int i = 0; i < l; i++) {
            char c = sb.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {  // replaced && with ||
                arr[flag++] = c;
                no++;
            }
        }

        // Reverse only the filled part of arr
        for (int i = 0, j = no - 1; i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Replace vowels in sb with reversed vowels
        int idx = 0;
        for (int i = 0; i < l; i++) {
            char c = sb.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                sb.setCharAt(i, arr[idx++]);
            }
        }

        return sb.toString();  // fixed toString()
    }
}
