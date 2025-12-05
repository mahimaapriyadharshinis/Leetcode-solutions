class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        int max = 0;
        for (int i = 0; i < arr1.length; i++) {
            max = Math.max(max, arr1[i]);
            max = Math.max(max, arr2[i]);
        }

        int[] count1 = new int[max + 1];
        int[] count2 = new int[max + 1];

        for (char c : arr1)
            count1[(int) c]++;

        for (char c : arr2)
            count2[(int) c]++;

        return java.util.Arrays.equals(count1, count2);
    }
}
