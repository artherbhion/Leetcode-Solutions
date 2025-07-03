class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    count++;
                    makezero(i,j,grid,r,c);
                }
            }
        }
        return count;
    }
    public static void makezero(int i,int j,char[][] grid,int r,int c){
        if(i<0 || j<0){
            return;
        }
        if(i>=r || j>=c){
            return;
        }
        if(grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        makezero(i-1,j,grid,r,c);
        makezero(i+1,j,grid,r,c);
        makezero(i,j+1,grid,r,c);
        makezero(i,j-1,grid,r,c);
    }
}