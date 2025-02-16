// class Solution {
//     public int islandPerimeter(int[][] grid) {
//         int ic=0;
//         int or=grid.length;
//         int oc=grid[0].length;
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]==1){
//                     ic++;
//                     tra(grid,i,j,oc,or);
//                 }
//             }
//         }
//         return ic;
//     }
//     public static void tra(int[][] grid,int r,int c,int oc,int or){
//         if(r<or && r>=0 && c>=0 &&c<oc){
//             if(grid[r][c]==0){
//                 return;
//             }
//         }
//         grid[r][c]=0;
//         tra(grid,r,c-1,oc,or);
//         tra(grid,r,c+1,oc,or);
//         tra(grid,r-1,c,oc,or);
//         tra(grid,r+1,c,oc,or);
//         tra(grid,r-1,c-1,oc,or);
//         tra(grid,r-1,c+1,oc,or);
//         tra(grid,r+1,c-1,oc,or);
//         tra(grid,r+1,c+1,oc,or);
//     }
// }
class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || grid[i - 1][j] == 0) perimeter++;
                    if (i == rows - 1 || grid[i + 1][j] == 0) perimeter++;
                    if (j == 0 || grid[i][j - 1] == 0) perimeter++;
                    if (j == cols - 1 || grid[i][j + 1] == 0) perimeter++;
                }
            }
        }
        return perimeter;
    }
}
