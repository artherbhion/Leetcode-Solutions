class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int ROW = matrix.length;
        int COL = matrix[0].length;
        int[][] dp = new int[ROW][COL];
        int longestSeq = 0;

        // for(int i = 0; i < ROW; i++) {
        //     for(int j = 0; j < COL; j++) {
        //         dp[i][j] = -1;
        //     }
        // }

        for(int i = 0; i < ROW; i++) {
            for(int j = 0; j < COL; j++) {
                int pathLength = longestPath(matrix, dp, ROW, COL, i, j, -1);
                longestSeq = Math.max(longestSeq, pathLength);
            }
        }
        return longestSeq;
    }

    public int longestPath(int[][] matrix, int[][] dp, int ROW, int COL, int row, int col, int prev) {
        if(row < 0 || row >= ROW || col < 0 || col >= COL){
            return 0;
        }
        if(matrix[row][col] <= prev){
            return 0;
        }
        if(dp[row][col] != 0){
            return dp[row][col];
        }

        int top = longestPath(matrix, dp, ROW, COL, row-1, col, matrix[row][col]);
        int bottom = longestPath(matrix, dp, ROW, COL, row+1, col, matrix[row][col]);
        int left = longestPath(matrix, dp, ROW, COL, row, col-1, matrix[row][col]);
        int right = longestPath(matrix, dp, ROW, COL, row, col+1, matrix[row][col]);

        int maxVal = 1 + Math.max(Math.max(top, bottom), Math.max(left, right));
        dp[row][col] = maxVal;
        return maxVal;
    }
}