class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int[][] dist = new int[n][m];

        int INF = 100000;

        // Step 1: initialize
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 0) dist[i][j] = 0;
                else dist[i][j] = INF;
            }
        }

        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] != 0){
                    if(i > 0)
                        dist[i][j] = Math.min(dist[i][j], dist[i-1][j] + 1);
                    if(j > 0)
                        dist[i][j] = Math.min(dist[i][j], dist[i][j-1] + 1);
                }
            }
        }

        // Step 3: bottom-right → top-left
        for(int i = n-1; i >= 0; i--){
            for(int j = m-1; j >= 0; j--){
                if(mat[i][j] != 0){
                    if(i < n-1)
                        dist[i][j] = Math.min(dist[i][j], dist[i+1][j] + 1);
                    if(j < m-1)
                        dist[i][j] = Math.min(dist[i][j], dist[i][j+1] + 1);
                }
            }
        }

        return dist;
    }
}