class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int l = points.length;
        int[][] arr = new int[l][2];

        for (int i = 0; i < l; i++) {
            arr[i][0] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            arr[i][1] = i;
        }

        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - 1 - i; j++) {
                if (arr[j][0] > arr[j + 1][0]) {
                    int temp = arr[j][0];
                    arr[j][0] = arr[j + 1][0];
                    arr[j + 1][0] = temp;

                    int temp1 = arr[j][1];
                    arr[j][1] = arr[j + 1][1];
                    arr[j + 1][1] = temp1;
                }
            }
        }

        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            int idx = arr[i][1];
            ans[i][0] = points[idx][0];
            ans[i][1] = points[idx][1];
        }

        return ans;
    }
}