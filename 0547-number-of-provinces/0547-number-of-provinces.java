class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                provinces++;
                dfs(isConnected, visited, i);
            }
        }
        return provinces;
    }

    private void dfs(int[][] g, boolean[] visited, int i) {
        visited[i] = true;
        for (int j = 0; j < g.length; j++) {
            if (g[i][j] == 1 && !visited[j]) {
                dfs(g, visited, j);
            }
        }
    }
}
