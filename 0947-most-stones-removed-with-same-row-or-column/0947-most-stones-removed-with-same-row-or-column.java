class Solution {
    public int removeStones(int[][] stones) {
        int l = stones.length;
        boolean[] visited = new boolean[l];

        int components = 0;

        for (int i = 0; i < l; i++) {
            if (!visited[i]) {
                dfs(i, stones, visited, l);
                components++;
            }
        }

        return l - components;
    }

    void dfs(int i, int[][] stones, boolean[] visited, int l) {
        visited[i] = true;

        int a = stones[i][0];
        int b = stones[i][1];

        for (int j = 0; j < l; j++) {
            if (!visited[j]) {
                if (stones[j][0] == a || stones[j][1] == b) {
                    dfs(j, stones, visited, l);
                }
            }
        }
    }
}