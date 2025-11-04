class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // find max value
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        int range = max - min + 1;
        int[] count = new int[range];

        // count occurrences
        for (int num : arr) {
            count[num - min]++;
        }

        // check uniqueness
        for (int i = 0; i < range; i++) {
            if (count[i] == 0) continue;
            for (int j = i + 1; j < range; j++) {
                if (count[j] == count[i]) return false;
            }
        }

        return true;
    }
}
