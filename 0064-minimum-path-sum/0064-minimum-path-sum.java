class Solution {
    public int minPathSum(int[][] grid) {
        int sum=0,r=grid.length,c=grid[0].length;
       int path[][]=new int[r][c];
       path[0][0]=grid[0][0];
       for(int i=1;i<c;i++){
            path[0][i]=path[0][i-1]+grid[0][i];
       }
       for(int i=1;i<r;i++){
        path[i][0]=grid[i][0]+path[i-1][0];
       }
       for(int i=1;i<r;i++){
        for(int j=1;j<c;j++){
            path[i][j]=grid[i][j]+Math.min(path[i][j-1],path[i-1][j]);
        }
       }
       return path[r-1][c-1];
    }
}