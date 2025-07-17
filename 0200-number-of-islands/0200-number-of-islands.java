class Solution {
    static int r;
    static int c;
    public int numIslands(char[][] grid) {
        r=grid.length;
        c=grid[0].length;
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    count++;
                    makezero(i,j,grid);
                }
            }
        }
        return count;
    }
    public static void makezero(int i,int j,char[][] grid){
        if(i<0 || j<0 ||i>=r || j>=c || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        makezero(i-1,j,grid);
        makezero(i+1,j,grid);
        makezero(i,j-1,grid);
        makezero(i,j+1,grid);
    }
}