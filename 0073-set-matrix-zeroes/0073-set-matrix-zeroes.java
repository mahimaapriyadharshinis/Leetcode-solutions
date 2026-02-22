class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[] r1=new int[r];
        int[] c1=new int[c];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    r1[i]=1;
                    c1[j]=1;
                }
            }
        }
        for(int i=0;i<r;i++){
            
            if(r1[i]==1){
                for(int j=0;j<c;j++){
                    matrix[i][j]=0;
                }
            }
            
        }
        for(int i=0;i<c;i++){
            
            if(c1[i]==1){
                for(int j=0;j<r;j++){
                    matrix[j][i]=0;
                }
            }
            
        }
    }
}