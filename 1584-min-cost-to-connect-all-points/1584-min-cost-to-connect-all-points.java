import java.util.*;

class Solution {

    public int dist(int a1, int a2, int b1, int b2) {
        return Math.abs(a1 - a2) + Math.abs(b1 - b2);
    }

    int[] parent;
    int[] rank;

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public boolean union(int x, int y) {
        int px = find(x);
        int py = find(y);

        if (px == py) return false;

        if (rank[px] < rank[py]) {
            parent[px] = py;
        } else if (rank[px] > rank[py]) {
            parent[py] = px;
        } else {
            parent[py] = px;
            rank[px]++;
        }
        return true;
    }

    public int minCostConnectPoints(int[][] points) {
        int l = points.length;
        int combinations = (l * (l - 1)) / 2;

        int[][] arr = new int[combinations][5];

        int k = 0;

        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {

                int a1 = points[i][0];
                int b1 = points[i][1];
                int a2 = points[j][0];
                int b2 = points[j][1];

                int d = dist(a1, a2, b1, b2);

                arr[k][0] = i;
                arr[k][1] = j;
                arr[k][2] = a1;
                arr[k][3] = b1;
                arr[k][4] = d;

                k++;
            }
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] e1, int[] e2) {
                return e1[4] - e2[4];
            }
        });

        parent = new int[l];
        rank = new int[l];
        for (int i = 0; i < l; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        int cost = 0;
        int edgesUsed = 0;

        for (int i = 0; i < combinations && edgesUsed < l - 1; i++) {
            int u = arr[i][0];
            int v = arr[i][1];
            int w = arr[i][4];

            if (union(u, v)) {
                cost += w;
                edgesUsed++;
            }
        }

        return cost;
    }
}