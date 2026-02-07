class Solution {
    public int calPoints(String[] operations) {
        int l = operations.length;
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = -1;
        }
        int flag = 0;

        for (int i = 0; i < l; i++) {
            if (operations[i].matches("-?\\d+")) {
                arr[flag++] = Integer.parseInt(operations[i]);
            } else if (operations[i].equals("C")) {
                flag--;
                arr[flag] = -1;
            } else if (operations[i].equals("D")) {
                int temp = arr[flag - 1];
                arr[flag++] = 2 * temp;
            } else if (operations[i].equals("+")) {
                int beforebefore = flag - 2;
                int before = flag - 1;
                arr[flag++] = arr[beforebefore] + arr[before];
            }
        }

        int f = 0;
        int sum = 0;
        while (f < flag) {
            sum += arr[f++];
        }
        return sum;
    }
}