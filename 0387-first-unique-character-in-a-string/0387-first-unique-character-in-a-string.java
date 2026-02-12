class Solution {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int l = arr.length;

        for (int i = 0; i < l; i++) {
            boolean unique = true;

            for (int j = 0; j < l; j++) {
                if (i != j && arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                return i;
            }
        }

        return -1;
    }
}